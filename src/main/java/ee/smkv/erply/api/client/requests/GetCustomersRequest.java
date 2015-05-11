package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.CustomersResponse;

import java.util.Date;
import java.util.List;

public class GetCustomersRequest extends Request<CustomersResponse> {

    private Integer customerID;
    private List<Integer> customerIDs;
    private Boolean searchFromMiddle;
    private String searchName;
    private String searchNameIncrementally;
    private String searchPersonFullName;
    private String searchPersonFirstName;
    private String searchPersonLastName;
    private String searchVATNo;
    private String searchCode;
    private String searchRegistryCode;
    private String searchAttributeName;
    private String searchAttributeValue;
    private Integer clientManagerID;
    private Integer groupID;
    private Integer groupIDWithSubgroups;
    private Integer payerID;
    private Boolean flagStatus;
    private String colorStatus;
    private Mode mode;
    private Boolean getBalanceInfo;
    private Boolean getBalanceWithoutPrepayments;
    private Boolean getPurchaseInfo;
    private Boolean getPOSDefaultCustomers;
    private Boolean getAddresses;
    private Boolean getContactPersons;
    private Boolean doNotCalculateRecordsTotal;
    private Date changedSince;
    private String lang;
    private String orderBy;
    private OrderByDirection orderByDir;
    private Integer recordsOnPage;
    private Integer pageNo;


    public GetCustomersRequest() {
        super("getCustomers");
    }

    @Override
    public Class<CustomersResponse> getResponseClass() {
        return CustomersResponse.class;
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

    public Boolean getSearchFromMiddle() {
        return searchFromMiddle;
    }

    public void setSearchFromMiddle(Boolean searchFromMiddle) {
        this.searchFromMiddle = searchFromMiddle;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getSearchNameIncrementally() {
        return searchNameIncrementally;
    }

    public void setSearchNameIncrementally(String searchNameIncrementally) {
        this.searchNameIncrementally = searchNameIncrementally;
    }

    public String getSearchPersonFullName() {
        return searchPersonFullName;
    }

    public void setSearchPersonFullName(String searchPersonFullName) {
        this.searchPersonFullName = searchPersonFullName;
    }

    public String getSearchPersonFirstName() {
        return searchPersonFirstName;
    }

    public void setSearchPersonFirstName(String searchPersonFirstName) {
        this.searchPersonFirstName = searchPersonFirstName;
    }

    public String getSearchPersonLastName() {
        return searchPersonLastName;
    }

    public void setSearchPersonLastName(String searchPersonLastName) {
        this.searchPersonLastName = searchPersonLastName;
    }

    public String getSearchVATNo() {
        return searchVATNo;
    }

    public void setSearchVATNo(String searchVATNo) {
        this.searchVATNo = searchVATNo;
    }

    public String getSearchCode() {
        return searchCode;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public String getSearchRegistryCode() {
        return searchRegistryCode;
    }

    public void setSearchRegistryCode(String searchRegistryCode) {
        this.searchRegistryCode = searchRegistryCode;
    }

    public String getSearchAttributeName() {
        return searchAttributeName;
    }

    public void setSearchAttributeName(String searchAttributeName) {
        this.searchAttributeName = searchAttributeName;
    }

    public String getSearchAttributeValue() {
        return searchAttributeValue;
    }

    public void setSearchAttributeValue(String searchAttributeValue) {
        this.searchAttributeValue = searchAttributeValue;
    }

    public Integer getClientManagerID() {
        return clientManagerID;
    }

    public void setClientManagerID(Integer clientManagerID) {
        this.clientManagerID = clientManagerID;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public Integer getGroupIDWithSubgroups() {
        return groupIDWithSubgroups;
    }

    public void setGroupIDWithSubgroups(Integer groupIDWithSubgroups) {
        this.groupIDWithSubgroups = groupIDWithSubgroups;
    }

    public Integer getPayerID() {
        return payerID;
    }

    public void setPayerID(Integer payerID) {
        this.payerID = payerID;
    }

    public Boolean getFlagStatus() {
        return flagStatus;
    }

    public void setFlagStatus(Boolean flagStatus) {
        this.flagStatus = flagStatus;
    }

    public String getColorStatus() {
        return colorStatus;
    }

    public void setColorStatus(String colorStatus) {
        this.colorStatus = colorStatus;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public Boolean getGetBalanceInfo() {
        return getBalanceInfo;
    }

    public void setGetBalanceInfo(Boolean getBalanceInfo) {
        this.getBalanceInfo = getBalanceInfo;
    }

    public Boolean getGetBalanceWithoutPrepayments() {
        return getBalanceWithoutPrepayments;
    }

    public void setGetBalanceWithoutPrepayments(Boolean getBalanceWithoutPrepayments) {
        this.getBalanceWithoutPrepayments = getBalanceWithoutPrepayments;
    }

    public Boolean getGetPurchaseInfo() {
        return getPurchaseInfo;
    }

    public void setGetPurchaseInfo(Boolean getPurchaseInfo) {
        this.getPurchaseInfo = getPurchaseInfo;
    }

    public Boolean getGetPOSDefaultCustomers() {
        return getPOSDefaultCustomers;
    }

    public void setGetPOSDefaultCustomers(Boolean getPOSDefaultCustomers) {
        this.getPOSDefaultCustomers = getPOSDefaultCustomers;
    }

    public Boolean getGetAddresses() {
        return getAddresses;
    }

    public void setGetAddresses(Boolean getAddresses) {
        this.getAddresses = getAddresses;
    }

    public Boolean getGetContactPersons() {
        return getContactPersons;
    }

    public void setGetContactPersons(Boolean getContactPersons) {
        this.getContactPersons = getContactPersons;
    }

    public Boolean getDoNotCalculateRecordsTotal() {
        return doNotCalculateRecordsTotal;
    }

    public void setDoNotCalculateRecordsTotal(Boolean doNotCalculateRecordsTotal) {
        this.doNotCalculateRecordsTotal = doNotCalculateRecordsTotal;
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

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public OrderByDirection getOrderByDir() {
        return orderByDir;
    }

    public void setOrderByDir(OrderByDirection orderByDir) {
        this.orderByDir = orderByDir;
    }

    public Integer getRecordsOnPage() {
        return recordsOnPage;
    }

    public void setRecordsOnPage(Integer recordsOnPage) {
        this.recordsOnPage = recordsOnPage;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public static enum Mode {
        CUSTOMERS, CONTACTS, ALL
    }
}
