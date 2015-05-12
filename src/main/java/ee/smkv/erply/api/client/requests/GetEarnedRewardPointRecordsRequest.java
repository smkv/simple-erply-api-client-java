package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.RewardPointRecordsResponse;

import java.util.Date;
import java.util.List;

public class GetEarnedRewardPointRecordsRequest extends Request<RewardPointRecordsResponse>{
    private Integer customerID;
    private List<Integer> customerIDs;
    private Date createdUnixTimeFrom;
    private Date createdUnixTimeTo;

    protected GetEarnedRewardPointRecordsRequest(String request) {
        super(request);
    }

    public GetEarnedRewardPointRecordsRequest() {
        super("getEarnedRewardPointRecords");
    }

    @Override
    public Class<RewardPointRecordsResponse> getResponseClass() {
        return RewardPointRecordsResponse.class;
    }

    public Date getCreatedUnixTimeFrom() {
        return createdUnixTimeFrom;
    }

    public void setCreatedUnixTimeFrom(Date createdUnixTimeFrom) {
        this.createdUnixTimeFrom = createdUnixTimeFrom;
    }

    public Date getCreatedUnixTimeTo() {
        return createdUnixTimeTo;
    }

    public void setCreatedUnixTimeTo(Date createdUnixTimeTo) {
        this.createdUnixTimeTo = createdUnixTimeTo;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public List<Integer> getCustomerIDs() {
        return customerIDs;
    }

    public void setCustomerIDs(List<Integer> customerIDs) {
        this.customerIDs = customerIDs;
    }
}
