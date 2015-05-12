package ee.smkv.erply.api.client.responses;

public class SaveCustomerResponse extends Response<SaveCustomerResponse.Record> {
  public static class Record {
    private Integer customerID;
    private Boolean alreadyExists;

    public Integer getCustomerID() {
      return customerID;
    }

    public void setCustomerID(Integer customerID) {
      this.customerID = customerID;
    }

    public Boolean getAlreadyExists() {
      return alreadyExists;
    }

    public void setAlreadyExists(Boolean alreadyExists) {
      this.alreadyExists = alreadyExists;
    }
  }
}
