package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.DeleteCustomerResponse;

public class DeleteCustomerRequest extends Request<DeleteCustomerResponse> {

  private final Integer customerID;

  public DeleteCustomerRequest(Integer customerID) {
    super("deleteCustomer");
    this.customerID = customerID;
  }

  public Integer getCustomerID() {
    return customerID;
  }

  @Override
  public Class<DeleteCustomerResponse> getResponseClass() {
    return DeleteCustomerResponse.class;
  }
}
