package ee.smkv.erply.api.client;

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

  public ErplyClient(String clientCode, String username, String password) {
    this.clientCode = clientCode;
    this.username = username;
    this.password = password;
    try {
      this.url = new URL(String.format("https://%s.erply.com/api/", clientCode));
    }
    catch (MalformedURLException e) {
      throw new RuntimeException("Unable to create Erply API url: " + e.getMessage(), e);
    }
  }

  public String sendRequest(String method, Map<String, Object> parameters) throws IOException {
    HttpsURLConnection connection = getConnection();
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);

    LinkedHashMap<String, Object> fixedParameters = new LinkedHashMap<>();
    if (parameters != null) {
      fixedParameters.putAll(parameters);
    }
    fixedParameters.put("version" , version);
    fixedParameters.put("clientCode" , clientCode);
    fixedParameters.put("request" , method);
    String queryString = getQueryString(fixedParameters);


    Writer writer = new OutputStreamWriter(connection.getOutputStream());
    writer.write(queryString);
    writer.flush();
    writer.close();


    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuilder builder = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      builder.append(line);
    }
    reader.close();

    return builder.toString();

  }

  private String getQueryString(Map<String, Object> parameters) throws UnsupportedEncodingException {
    StringBuilder builder = new StringBuilder();

    for (String key : parameters.keySet()) {
      if (builder.length() > 0) {
        builder.append('&');
      }
      Object value = parameters.get(key);
      builder.append(URLEncoder.encode(key, UTF_8)).append('=').append(value == null ? "" : URLEncoder.encode(String.valueOf(value), UTF_8));
    }

    return builder.toString();
  }

  private HttpsURLConnection getConnection() throws IOException {
    if (StringUtils.notEmpty(System.getProperty("http.proxyHost"))) {
      Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.valueOf(System.getProperty("http.proxyPort", "80"))));
      return (HttpsURLConnection)url.openConnection(proxy);
    }

    return (HttpsURLConnection)url.openConnection();
  }
}
