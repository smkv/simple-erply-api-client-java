package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.AddCustomerRewardPointsResponse;

import java.util.Date;

public class AddCustomerRewardPointsRequest extends Request<AddCustomerRewardPointsResponse> {

    private Integer customerID;
    private Integer invoiceID;
    private Integer points;
    private Integer pointOfSaleID;
    private Integer employeeID;
    private String description;
    private Date createdUnixTime;
    private Date expiryUnixTime;

    public AddCustomerRewardPointsRequest() {
        super("addCustomerRewardPoints");
    }

    @Override
    public Class<AddCustomerRewardPointsResponse> getResponseClass() {
        return AddCustomerRewardPointsResponse.class;
    }

    public Date getCreatedUnixTime() {
        return createdUnixTime;
    }

    public void setCreatedUnixTime(Date createdUnixTime) {
        this.createdUnixTime = createdUnixTime;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Date getExpiryUnixTime() {
        return expiryUnixTime;
    }

    public void setExpiryUnixTime(Date expiryUnixTime) {
        this.expiryUnixTime = expiryUnixTime;
    }

    public Integer getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(Integer invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Integer getPointOfSaleID() {
        return pointOfSaleID;
    }

    public void setPointOfSaleID(Integer pointOfSaleID) {
        this.pointOfSaleID = pointOfSaleID;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
