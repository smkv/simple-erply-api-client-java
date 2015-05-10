package ee.smkv.erply.api.client.utils;

import ee.smkv.erply.api.client.requests.Request;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.codec.binary.Base64;

import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.*;

public class RequestParametersBuilder {

    public static List<String> forbiddenFields = Arrays.asList("class", "responseClass");
    private final Request request;


    public RequestParametersBuilder(Request request) {
        this.request = request;
    }


    public Map<String, String> build() {
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
                    Collection collection = (Collection) value;

                    if (collection.size() > 0) {
                        Object collectionItem = collection.iterator().next();
                        if (collectionItem instanceof String || collectionItem instanceof Number) {
                            map.put(name, listToString(collection));
                            continue;
                        }
                    }

                    for (Object collectionItem : collection) {
                        index++;
                        for (PropertyDescriptor propertyDescriptor2 : PropertyUtils.getPropertyDescriptors(collectionItem)) {
                            String name2 = propertyDescriptor2.getName();
                            if (forbiddenFields.contains(name2)) {
                                continue;
                            }
                            Object value2 = propertyDescriptor2.getReadMethod().invoke(collectionItem);
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

    private String listToString(Collection collection) {
        StringBuilder builder = new StringBuilder();
        for (Object item : collection) {
            if (builder.length() > 0) {
                builder.append(',');
            }
            builder.append(item);
        }
        return builder.toString();
    }

    private String toString(Object value) {
        if (value instanceof String) {
            return (String) value;
        }
        if (value instanceof Date) {
            return String.valueOf(((Date) value).getTime() / 1000);
        }
        if (value instanceof BigDecimal) {
            return ((BigDecimal) value).toPlainString();
        }
        if (value instanceof Boolean) {
            return (Boolean) value ? "1" : "0";
        }
        if(value instanceof byte[]) {
            return Base64.encodeBase64String((byte[]) value);
        }
        return String.valueOf(value);
    }


}
