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
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErplyClient {
  public static final String UTF_8 = "UTF8";
  private final String version = "1.0";
  private final String clientCode;
  private final String username;
  private final String password;
  private final URL url;

  private ErplySession session;

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


    LinkedHashMap<String, Object> fixedParameters = new LinkedHashMap<>();
    if (parameters != null) {
      fixedParameters.putAll(parameters);
    }
    fixedParameters.put("version", version);
    fixedParameters.put("clientCode", clientCode);
    fixedParameters.put("request", method);


    if (!"verifyUser".equals(method)) {
      if (session == null || !session.isValid()) {
        session = getNewSession();
      }
      fixedParameters.put("sessionKey", session.getKey());
    }

    String queryString = getQueryString(fixedParameters);


    HttpsURLConnection connection = getConnection();
    connection.setRequestMethod("POST");
    connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
    connection.setUseCaches(false);
    connection.setDoInput(true);
    connection.setDoOutput(true);

    System.out.printf("%s >>> %s%n" , queryString , url);
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


    String response = builder.toString();
    System.out.printf("%s >>> %s%n" , url , response);


    Matcher errorMatcher = Pattern.compile("\"responseStatus\"\\s*:\\s*\"error\"").matcher(response);
    if (errorMatcher.find()) {
      Matcher errorCodeMather = Pattern.compile("\"errorCode\"\\s*:\\s*(\\d+)").matcher(response);
      Matcher errorFieldMather = Pattern.compile("\"errorField\"\\s*:\\s*(null|\"([^\"]*)\")").matcher(response);
      throw new ErplyException(errorCodeMather.find() ? errorCodeMather.group(1) : null, errorFieldMather.find() ? errorFieldMather.group(2) : null, response);
    }

    return response;

  }

  private ErplySession getNewSession() throws IOException {
    String response = sendRequest("verifyUser", new LinkedHashMap<String, Object>() {{
      put("username", username);
      put("password", password);
    }});

    Matcher sessionKeyMatcher = Pattern.compile("\"sessionKey\"\\s*:\\s*\"([^\"]*)\"").matcher(response);
    Matcher sessionLengthMatcher = Pattern.compile("\"sessionLength\"\\s*:\\s*(\\d+)").matcher(response);

    sessionKeyMatcher.find();
    String key = sessionKeyMatcher.group(1);
    sessionLengthMatcher.find();
    Date now  = new Date();
    Date expire = new Date( now.getTime() + Long.valueOf( sessionLengthMatcher.group(1)));

    return new ErplySession(key , now , expire);
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
