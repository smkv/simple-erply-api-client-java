package ee.smkv.erply.api.client;

import com.google.gson.Gson;
import ee.smkv.erply.api.client.requests.Request;
import ee.smkv.erply.api.client.requests.VerifyUserRequest;
import ee.smkv.erply.api.client.responses.Response;
import ee.smkv.erply.api.client.responses.VerifyUserResponse;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.Map;

public class ErplyClient {
    public static final String UTF_8 = "UTF8";
    private final String version = "1.0";
    private final String clientCode;
    private final String username;
    private final String password;
    private final URL url;

    private Session session;

    public ErplyClient(String clientCode, String username, String password) {
        this.clientCode = clientCode;
        this.username = username;
        this.password = password;
        try {
            this.url = new URL(String.format("https://%s.erply.com/api/", clientCode));
        } catch (MalformedURLException e) {
            throw new RuntimeException("Unable to create Erply API url: " + e.getMessage(), e);
        }
    }

    public <T extends Response> T invoke(Request<T> request) throws IOException {
        request.addParameter("version", version);
        request.addParameter("clientCode", clientCode);
        request.addParameter("request", request.getName());

        if (!(request instanceof VerifyUserRequest)) {
            if (session == null || !session.isValid()) {
                session = createNewSession();
            }
            request.addParameter("sessionKey", session.getKey());
        }

        ErplyHttpsConnection connection = new ErplyHttpsConnection(url);
        connection.write(getQueryString(request.getParameters()));
        String responseText = connection.read();

        T response = new Gson().fromJson(responseText, request.getResponseClass());
        response.validate();
        return response;

    }



    public Session getSession() {
        return session;
    }

    private Session createNewSession() throws IOException {
        VerifyUserRequest request = new VerifyUserRequest(username, password);
        VerifyUserResponse response = invoke(request);
        return new Session(response);
    }

    private String getQueryString(Map<String, String> parameters) throws UnsupportedEncodingException {
        StringBuilder builder = new StringBuilder();

        for (String key : parameters.keySet()) {
            if (builder.length() > 0) {
                builder.append('&');
            }
            String value = parameters.get(key);
            builder.append(URLEncoder.encode(key, UTF_8)).append('=').append(value == null ? "" : URLEncoder.encode(value, UTF_8));
        }

        return builder.toString();
    }


}
