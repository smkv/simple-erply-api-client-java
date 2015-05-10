package ee.smkv.erply.api.client;

import java.io.IOException;
import java.util.Map;

public interface EndPoint {
    
    String call(Map<String,String> parameters) throws IOException;
    
}
