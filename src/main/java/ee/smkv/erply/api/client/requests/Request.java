package ee.smkv.erply.api.client.requests;


import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Request<RT> {
    private final String name;
    private Map<String,String> parameters = new LinkedHashMap<>();

    protected Request(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void addParameter(String key , String value){
        parameters.put(key, value);
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
    
    public abstract Class<RT> getResponseClass();

    @Override
    public String toString() {
        return "Request{" +
                "name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
