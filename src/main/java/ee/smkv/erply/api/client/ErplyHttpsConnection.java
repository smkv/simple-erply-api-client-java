package ee.smkv.erply.api.client;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

class ErplyHttpsConnection {
    private final URL url;
    private final HttpsURLConnection connection;

    ErplyHttpsConnection(URL url) throws IOException {
        this.url = url;
        connection = getConnection(url);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setUseCaches(false);
        connection.setDoInput(true);
        connection.setDoOutput(true);
    }

    void write( String queryString) throws IOException {
        Writer writer = null;
        try {
            writer = new OutputStreamWriter(connection.getOutputStream());
            writer.write(queryString);
            writer.flush();
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    String read() throws IOException {
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return builder.toString();
    }

    private static HttpsURLConnection getConnection(URL url) throws IOException {
        if (StringUtils.notEmpty(System.getProperty("http.proxyHost"))) {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.valueOf(System.getProperty("http.proxyPort", "80"))));
            return (HttpsURLConnection) url.openConnection(proxy);
        }

        return (HttpsURLConnection) url.openConnection();
    }
}

