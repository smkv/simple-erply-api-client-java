package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.CustomerGroupsResponse;

import java.util.Date;

public class GetCustomerGroupsRequest extends Request<CustomerGroupsResponse> {
    
    private Date changedSince;
    private String lang;
    
    public GetCustomerGroupsRequest() {
        super("getCustomerGroups");
    }

    @Override
    public Class<CustomerGroupsResponse> getResponseClass() {
        return CustomerGroupsResponse.class;
    }

    public Date getChangedSince() {
        return changedSince;
    }

    public void setChangedSince(Date changedSince) {
        this.changedSince = changedSince;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
