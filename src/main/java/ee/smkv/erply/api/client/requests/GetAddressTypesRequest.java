package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.AddressTypesResponse;

public class GetAddressTypesRequest extends Request<AddressTypesResponse> {
  private Language lang;

  public GetAddressTypesRequest() {
    super("getAddressTypes");
  }

  public Language getLang() {
    return lang;
  }

  public void setLang(Language lang) {
    this.lang = lang;
  }

  @Override
  public Class<AddressTypesResponse> getResponseClass() {
    return AddressTypesResponse.class;
  }
}
