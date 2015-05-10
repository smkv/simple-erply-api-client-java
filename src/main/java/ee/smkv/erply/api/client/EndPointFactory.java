package ee.smkv.erply.api.client;

import java.io.IOException;
import java.net.URL;

public interface EndPointFactory {
    EndPoint createEndPoint(URL url) throws IOException;
}
