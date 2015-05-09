package ee.smkv.erply.api.client;


import ee.smkv.erply.api.client.responses.Status;

import java.io.IOException;

public class ErplyException extends IOException {
  private Status status;

  public ErplyException(Status status) {
    this(String.format("Error #%s %s" , status.getErrorCode() , status.getErrorMessage()));
    this.status = status;
  }


  public ErplyException(String message) {
    super(message);
  }

  public Status getStatus() {
    return status;
  }
}
