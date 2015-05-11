package ee.smkv.erply.api.client.utils;

import ee.smkv.erply.api.client.requests.Parameter;
import ee.smkv.erply.api.client.requests.Request;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.codec.binary.Base64;

import java.beans.PropertyDescriptor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
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
        String name = getPropertyName(propertyDescriptor);
        if (forbiddenFields.contains(name)) {
          continue;
        }
        Object value = propertyDescriptor.getReadMethod().invoke(request);
        if (value instanceof Collection) {
          int index = 0;
          Collection collection = (Collection)value;

          if (collection.size() > 0) {
            Object collectionItem = collection.iterator().next();
            if (collectionItem instanceof String || collectionItem instanceof Number) {
              map.put(name, listToString(collection, propertyDescriptor));
              continue;
            }
          }

          for (Object collectionItem : collection) {
            index++;
            for (PropertyDescriptor propertyDescriptor2 : PropertyUtils.getPropertyDescriptors(collectionItem)) {
              String name2 = getPropertyName(propertyDescriptor2);
              if (forbiddenFields.contains(name2)) {
                continue;
              }
              Object value2 = propertyDescriptor2.getReadMethod().invoke(collectionItem);
              if (value2 != null) {
                map.put(name2 + index, toString(value2, propertyDescriptor2));
              }
            }
          }
        } else if(value instanceof Map){

          for (Object key : ((Map) value).keySet()) {
            Object mapItem = ((Map) value).get(key);
            for (PropertyDescriptor propertyDescriptor2 : PropertyUtils.getPropertyDescriptors(mapItem)) {
              String name2 = getPropertyName(propertyDescriptor2);
              if (forbiddenFields.contains(name2)) {
                continue;
              }
              Object value2 = propertyDescriptor2.getReadMethod().invoke(mapItem);
              if (value2 != null) {
                map.put(name2 + key, toString(value2, propertyDescriptor2));
              }
            }
          }
          
        }
        else if (value != null) {
          map.put(name, toString(value, propertyDescriptor));
        }
      }
      catch (IllegalAccessException | InvocationTargetException ignore) {
        ignore.printStackTrace();
      }
    }

    return map;
  }

  private String getPropertyName(PropertyDescriptor propertyDescriptor) {
    Method readMethod = propertyDescriptor.getReadMethod();
    Parameter annotation = readMethod.getAnnotation(Parameter.class);
    if (annotation != null && StringUtils.notEmpty(annotation.value())) {
      return annotation.value();
    }
    return propertyDescriptor.getName();
  }

  private String listToString(Collection collection, PropertyDescriptor propertyDescriptor) {
    StringBuilder builder = new StringBuilder();
    for (Object item : collection) {
      if (builder.length() > 0) {
        builder.append(',');
      }
      builder.append(toString(item, propertyDescriptor));
    }
    return builder.toString();
  }

  private String toString(Object value, PropertyDescriptor propertyDescriptor) {
    Method readMethod = propertyDescriptor.getReadMethod();
    Parameter annotation = readMethod.getAnnotation(Parameter.class);
    String format = annotation != null && StringUtils.notEmpty(annotation.format()) ? annotation.format() : null;

    if (value instanceof String) {
      return (String)value;
    }
    if (value instanceof Date) {
      if(format != null){
        return new SimpleDateFormat(format).format(value);
      }
      return String.valueOf(((Date)value).getTime() / 1000);
    }
    if (value instanceof BigDecimal) {
      if(format != null){
        return  new DecimalFormat(format).format(value);
      }
      return ((BigDecimal)value).toPlainString();
    }
    if (value instanceof Number) {
      if(format != null){
        return  new DecimalFormat(format).format(value);
      }
      return ((Number)value).toString();
    }
    if (value instanceof Boolean) {
      return (Boolean)value ? "1" : "0";
    }
    if (value instanceof byte[]) {
      return Base64.encodeBase64String((byte[])value);
    }
    return String.valueOf(value);
  }


}
