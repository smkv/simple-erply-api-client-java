package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.Response;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Request<T extends Response> {
    protected final String request;
    protected final String version = "1.0";
    protected String clientCode;
    protected String sessionKey;


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

    
    public abstract Class<T> getResponseClass();

    @Override
    public String toString() {
        return request;
    }
}
