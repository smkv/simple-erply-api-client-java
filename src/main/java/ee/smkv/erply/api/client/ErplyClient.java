package ee.smkv.erply.api.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import ee.smkv.erply.api.client.requests.Request;
import ee.smkv.erply.api.client.requests.VerifyUserRequest;
import ee.smkv.erply.api.client.responses.Response;
import ee.smkv.erply.api.client.responses.VerifyUserResponse;
import ee.smkv.erply.api.client.utils.BigDecimalSerializer;
import ee.smkv.erply.api.client.utils.BooleanSerializer;
import ee.smkv.erply.api.client.utils.DateSerializer;
import ee.smkv.erply.api.client.utils.RequestParametersBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

public class ErplyClient {

    private final String clientCode;
    private final String username;
    private final String password;
    private final URL url;

    private Session session;
    
    private Gson gson;
    {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Boolean.class , new BooleanSerializer());
        builder.registerTypeAdapter(BigDecimal.class , new BigDecimalSerializer());
        builder.registerTypeAdapter(Date.class , new DateSerializer());
        gson = builder.create();
    }

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

        request.setClientCode(clientCode);
        if (!(request instanceof VerifyUserRequest)) {
            synchronized (this) {
                if (session == null || !session.isValid()) {
                    session = createNewSession();
                }
                request.setSessionKey(session.getKey());
            }
        }

        ErplyHttpsConnection connection = new ErplyHttpsConnection(url);
        connection.write(new RequestParametersBuilder(request).build());
        String responseText = connection.read();

        T response = gson.fromJson(responseText, request.getResponseClass());
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




}
