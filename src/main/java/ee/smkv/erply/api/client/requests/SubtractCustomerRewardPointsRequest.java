package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.SubtractCustomerRewardPointsResponse;

import java.util.Date;

public class SubtractCustomerRewardPointsRequest extends Request<SubtractCustomerRewardPointsResponse> {

    private final Integer customerID;
    private Integer invoiceID;
    private Integer campaignID;
    private Integer warehouseID;
    private Integer salepointID;
    private Integer salespersonID;
    private final Integer points;
    private Integer issuedCouponID;
    private Date subtractedUnixTime;
    private String description;

    public SubtractCustomerRewardPointsRequest(Integer customerID, Integer points) {
        super("subtractCustomerRewardPoints");
        this.customerID = customerID;
        this.points = points;
    }

    @Override
    public Class<SubtractCustomerRewardPointsResponse> getResponseClass() {
        return SubtractCustomerRewardPointsResponse.class;
    }

    public Integer getCampaignID() {
        return campaignID;
    }

    public void setCampaignID(Integer campaignID) {
        this.campaignID = campaignID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Integer getIssuedCouponID() {
        return issuedCouponID;
    }

    public void setIssuedCouponID(Integer issuedCouponID) {
        this.issuedCouponID = issuedCouponID;
    }

    public Integer getPoints() {
        return points;
    }

    public Integer getSalepointID() {
        return salepointID;
    }

    public void setSalepointID(Integer salepointID) {
        this.salepointID = salepointID;
    }

    public Integer getSalespersonID() {
        return salespersonID;
    }

    public void setSalespersonID(Integer salespersonID) {
        this.salespersonID = salespersonID;
    }

    public Date getSubtractedUnixTime() {
        return subtractedUnixTime;
    }

    public void setSubtractedUnixTime(Date subtractedUnixTime) {
        this.subtractedUnixTime = subtractedUnixTime;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }
}
