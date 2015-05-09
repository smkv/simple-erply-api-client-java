package ee.smkv.erply.api.client.utils;

import ee.smkv.erply.api.client.requests.Request;
import org.apache.commons.beanutils.PropertyUtils;

import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.*;

public class RequestParametersBuilder {
    public static final String UTF_8 = "UTF8";
    public static List<String> forbiddenFields = Arrays.asList("class", "responseClass");
    private final Request request;


    public RequestParametersBuilder(Request request) {
        this.request = request;
    }

    public String build() {
        return createQueryString(createMap());
    }

    private Map<String, String> createMap() {
        Map<String, String> map = new LinkedHashMap<>();

        for (PropertyDescriptor propertyDescriptor : PropertyUtils.getPropertyDescriptors(request)) {
            try {
                String name = propertyDescriptor.getName();
                if (forbiddenFields.contains(name)) {
                    continue;
                }
                Object value = propertyDescriptor.getReadMethod().invoke(request);
                if (value instanceof Collection) {
                    int index = 0;
                    for (Object collectionItem : (Collection) value) {
                        index++;
                        for (PropertyDescriptor propertyDescriptor2 : PropertyUtils.getPropertyDescriptors(collectionItem)) {
                            String name2 = propertyDescriptor.getName();
                            if (forbiddenFields.contains(name2)) {
                                continue;
                            }
                            Object value2 = propertyDescriptor.getReadMethod().invoke(collectionItem);
                            if (value2 != null) {
                                map.put(name2 + index, toString(value2));
                            }
                        }
                    }
                } else if (value != null) {
                    map.put(name, toString(value));
                }
            } catch (IllegalAccessException | InvocationTargetException ignore) {
                ignore.printStackTrace();
            }
        }

        return map;
    }

    private String toString(Object value) {
        if (value instanceof String) {
            return (String) value;
        }
        if (value instanceof Date) {
            return String.valueOf(((Date) value).getTime());
        }
        if (value instanceof BigDecimal) {
            return ((BigDecimal) value).toPlainString();
        }
        if (value instanceof Boolean) {
            return (Boolean) value ? "1" : "0";

        }
        return String.valueOf(value);
    }

    private String createQueryString(Map<String, String> parameters) {
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
