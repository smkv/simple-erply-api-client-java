package ee.smkv.erply.api.client;


import java.io.IOException;

public class ErplyException extends IOException {
  private final String code;
  private final String errorField;
  private final String response;

  public ErplyException(String code, String errorField, String response) {
    super(String.format("Error #%s" , code));
    this.code = code;
    this.errorField = errorField;
    this.response = response;
  }

  public String getCode() {
    return code;
  }

  public String getErrorField() {
    return errorField;
  }

  public String getResponse() {
    return response;
  }
}
