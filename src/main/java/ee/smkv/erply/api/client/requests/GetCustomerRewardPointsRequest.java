package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.CustomerRewardPointsResponse;

public class GetCustomerRewardPointsRequest extends Request<CustomerRewardPointsResponse> {
    private final Integer customerID;
    public GetCustomerRewardPointsRequest(Integer customerID) {
        super("getCustomerRewardPoints");
        this.customerID = customerID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    @Override
    public Class<CustomerRewardPointsResponse> getResponseClass() {
        return CustomerRewardPointsResponse.class;
    }
}
