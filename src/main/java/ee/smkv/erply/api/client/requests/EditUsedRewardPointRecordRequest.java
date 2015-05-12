package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.EditUsedRewardPointRecordResponse;

public class EditUsedRewardPointRecordRequest extends Request<EditUsedRewardPointRecordResponse> {
    private final Integer transactionID;
    private Integer customerID;
    private Integer invoiceID;
    private Integer campaignID;
    private Integer warehouseID;
    private Integer salepointID;
    private Integer salespersonID;
    private Integer issuedCouponID;
    private Integer description;

    public EditUsedRewardPointRecordRequest(Integer transactionID) {
        super("editUsedRewardPointRecord");
        this.transactionID = transactionID;
    }

    @Override
    public Class<EditUsedRewardPointRecordResponse> getResponseClass() {
        return EditUsedRewardPointRecordResponse.class;
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

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
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

    public Integer getTransactionID() {
        return transactionID;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }
}
