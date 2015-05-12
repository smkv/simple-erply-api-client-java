package ee.smkv.erply.api.client.models;

import java.util.Date;

public class RewardPointRecord {
    private Integer transactionID;
    private Integer customerID;
    private String customerCardNumber;
    private Integer invoiceID;
    private String invoiceNo;
    private Integer earnedPoints;
    private Integer remainingPoints;
    private Date createdUnixTime;
    private Date expiryUnixTime;
    private Integer pointOfSaleID;
    private String pointOfSaleName;
    private Integer employeeID;
    private String employeeName;
    private String description;


    public Date getCreatedUnixTime() {
        return createdUnixTime;
    }

    public void setCreatedUnixTime(Date createdUnixTime) {
        this.createdUnixTime = createdUnixTime;
    }

    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    public void setCustomerCardNumber(String customerCardNumber) {
        this.customerCardNumber = customerCardNumber;
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

    public Integer getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(Integer earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Integer getPointOfSaleID() {
        return pointOfSaleID;
    }

    public void setPointOfSaleID(Integer pointOfSaleID) {
        this.pointOfSaleID = pointOfSaleID;
    }

    public String getPointOfSaleName() {
        return pointOfSaleName;
    }

    public void setPointOfSaleName(String pointOfSaleName) {
        this.pointOfSaleName = pointOfSaleName;
    }

    public Integer getRemainingPoints() {
        return remainingPoints;
    }

    public void setRemainingPoints(Integer remainingPoints) {
        this.remainingPoints = remainingPoints;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
    }
}
