package ee.smkv.erply.api.client.utils;

public final class StringUtils {

  public static boolean isEmpty(String s){
    return s == null || s.trim().length() == 0;
  }

  public static boolean notEmpty(String s){
    return !isEmpty(s);
  }
}
