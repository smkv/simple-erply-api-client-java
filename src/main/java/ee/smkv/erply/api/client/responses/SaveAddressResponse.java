package ee.smkv.erply.api.client.responses;

public class SaveAddressResponse extends Response<SaveAddressResponse.Record> {
  public static class Record {
    private Integer addressID;

    public Integer getAddressID() {
      return addressID;
    }

    public void setAddressID(Integer addressID) {
      this.addressID = addressID;
    }
  }
}
