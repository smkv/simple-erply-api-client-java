package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.Response;
import ee.smkv.erply.api.client.utils.QueryStringBuilder;
import ee.smkv.erply.api.client.utils.RequestParametersBuilder;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Request<T extends Response> {
    public static final String ISO_DATE_FORMAT = "yyyy-MM-dd";
    protected final String request;
    protected final String version = "1.0";
    protected String clientCode;
    protected String sessionKey;
    protected ResponseMode responseMode;


    protected Request(String request) {
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    public String getVersion() {
        return version;
    }

    public String getClientCode() {
        return clientCode;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public ResponseMode getResponseMode() {
        return responseMode;
    }

    public void setResponseMode(ResponseMode responseMode) {
        this.responseMode = responseMode;
    }

    public abstract Class<T> getResponseClass();

    @Override
    public String toString() {
        return new QueryStringBuilder(new RequestParametersBuilder(this).build()).build();
    }
}
