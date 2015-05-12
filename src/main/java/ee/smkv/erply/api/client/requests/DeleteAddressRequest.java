package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.DeleteAddressResponse;

public class DeleteAddressRequest extends Request<DeleteAddressResponse> {
  private final Integer addressID;

  public DeleteAddressRequest(Integer addressID) {
    super("deleteAddress");
    this.addressID = addressID;
  }

  public Integer getAddressID() {
    return addressID;
  }

  @Override
  public Class<DeleteAddressResponse> getResponseClass() {
    return DeleteAddressResponse.class;
  }
}
