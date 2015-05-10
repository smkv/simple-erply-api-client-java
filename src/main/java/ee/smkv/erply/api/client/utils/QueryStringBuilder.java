package ee.smkv.erply.api.client.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class QueryStringBuilder {
    public static final String UTF_8 = "UTF8";
    private final Map<String, String> parameters;

    public QueryStringBuilder(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String build() {
        StringBuilder builder = new StringBuilder();

        for (String key : parameters.keySet()) {
            if (builder.length() > 0) {
                builder.append('&');
            }
            String value = parameters.get(key);
            try {
                builder.append(URLEncoder.encode(key, UTF_8)).append('=').append(value == null ? "" : URLEncoder.encode(value, UTF_8));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e.getMessage(), e);
            }
        }

        return builder.toString();
    }
}
