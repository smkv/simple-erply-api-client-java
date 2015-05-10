package ee.smkv.erply.api.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ee.smkv.erply.api.client.impl.DefaultHttpsEndPointFactory;
import ee.smkv.erply.api.client.requests.Request;
import ee.smkv.erply.api.client.requests.VerifyUserRequest;
import ee.smkv.erply.api.client.responses.Response;
import ee.smkv.erply.api.client.responses.VerifyUserResponse;
import ee.smkv.erply.api.client.utils.BigDecimalSerializer;
import ee.smkv.erply.api.client.utils.BooleanSerializer;
import ee.smkv.erply.api.client.utils.DateSerializer;
import ee.smkv.erply.api.client.utils.RequestParametersBuilder;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Map;

public class ErplyClient {

    private final String clientCode;
    private final String username;
    private final String password;
    private final URL url;
    private EndPointFactory endPointFactory = new DefaultHttpsEndPointFactory();

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

        Map<String, String> parameters = new RequestParametersBuilder(request).build();

        EndPoint endPoint = endPointFactory.createEndPoint(url);
        String responseText = endPoint.call(parameters);

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

    public String getClientCode() {
        return clientCode;
    }

    public String getUsername() {
        return username;
    }

    public URL getUrl() {
        return url;
    }

    public EndPointFactory getEndPointFactory() {
        return endPointFactory;
    }

    public void setEndPointFactory(EndPointFactory endPointFactory) {
        this.endPointFactory = endPointFactory;
    }

    @Override
    public String toString() {
        return "ErplyClient{" +
                "clientCode='" + clientCode + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", url=" + url +
                '}';
    }
}
