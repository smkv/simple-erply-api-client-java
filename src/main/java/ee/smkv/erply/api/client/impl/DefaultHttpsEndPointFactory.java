package ee.smkv.erply.api.client.impl;

import ee.smkv.erply.api.client.EndPoint;
import ee.smkv.erply.api.client.EndPointFactory;

import java.io.IOException;
import java.net.URL;

public class DefaultHttpsEndPointFactory implements EndPointFactory {
    @Override
    public EndPoint createEndPoint(URL url) throws IOException {
        return new DefaultHttpsEndPoint(url);
    }
}
