package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Customer {
    private Integer customerID;
    private CustomerType customerType;
    private String fullName;
    private String companyName;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Integer groupID;
    private String groupName;
    private Integer payerID;
    private String phone;
    private String mobile;
    private String email;
    private String fax;
    private String code;
    private Date birthday;
    private String integrationCode;
    private Boolean flagStatus;
    private String colorStatus;
    private String image;
    private Boolean taxExempt;
    private Boolean paysViaFactoring;
    private Integer rewardPoints;
    private String twitterID;
    private String facebookName;
    private String creditCardLastNumbers;
    private Boolean isPOSDefaultCustomer;
    private String euCustomerType;
    private Integer credit;
    private Boolean salesBlocked;
    private String referenceNumber;
    private String customerCardNumber;
    private Boolean rewardPointsDisabled;
    private Boolean posCouponsDisabled;
    private String lastModifierUsername;
    private List<Address> addresses;
    private List<ContactPerson> contactPersons;
    private List<Attribute> attributes;
    private List<Attribute> longAttributes;
    private BigDecimal actualBalance;
    private Integer  creditLimit;
    private BigDecimal availableCredit;
    private Boolean creditAllowed;
    private String vatNumber;
    private String skype;
    private String website;
    private String webshopUsername;
    private String webshopLastLogin;
    private String bankName;
    private String bankAccountNumber;
    private String bankIBAN;
    private String bankSWIFT;
    private Integer jobTitleID;
    private String jobTitleName;
    private Integer companyID;
    private String employerName;
    private Integer customerManagerID;
    private String customerManagerName;
    private Integer paymentDays;
    private String penaltyPerDay;
    private Integer priceListID;
    private Integer priceListID2;
    private Integer priceListID3;
    private Boolean outsideEU;
    private Integer businessAreaID;
    private String businessAreaName;
    private Integer deliveryTypeID;
    private String notes;
    private Date added;
    private Date lastModified;
    private Integer lastModifierEmployeeID;
    private String address;
    private String street;
    private String address2;
    private String city;
    private String postalCode;
    private String state;
    private String country;


    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getPayerID() {
        return payerID;
    }

    public void setPayerID(Integer payerID) {
        this.payerID = payerID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIntegrationCode() {
        return integrationCode;
    }

    public void setIntegrationCode(String integrationCode) {
        this.integrationCode = integrationCode;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Boolean getPaysViaFactoring() {
        return paysViaFactoring;
    }

    public void setPaysViaFactoring(Boolean paysViaFactoring) {
        this.paysViaFactoring = paysViaFactoring;
    }

    public Integer getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(Integer rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    public String getTwitterID() {
        return twitterID;
    }

    public void setTwitterID(String twitterID) {
        this.twitterID = twitterID;
    }

    public String getFacebookName() {
        return facebookName;
    }

    public void setFacebookName(String facebookName) {
        this.facebookName = facebookName;
    }

    public String getCreditCardLastNumbers() {
        return creditCardLastNumbers;
    }

    public void setCreditCardLastNumbers(String creditCardLastNumbers) {
        this.creditCardLastNumbers = creditCardLastNumbers;
    }

    public Boolean getIsPOSDefaultCustomer() {
        return isPOSDefaultCustomer;
    }

    public void setIsPOSDefaultCustomer(Boolean isPOSDefaultCustomer) {
        this.isPOSDefaultCustomer = isPOSDefaultCustomer;
    }

    public String getEuCustomerType() {
        return euCustomerType;
    }

    public void setEuCustomerType(String euCustomerType) {
        this.euCustomerType = euCustomerType;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Boolean getSalesBlocked() {
        return salesBlocked;
    }

    public void setSalesBlocked(Boolean salesBlocked) {
        this.salesBlocked = salesBlocked;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    public void setCustomerCardNumber(String customerCardNumber) {
        this.customerCardNumber = customerCardNumber;
    }

    public Boolean getRewardPointsDisabled() {
        return rewardPointsDisabled;
    }

    public void setRewardPointsDisabled(Boolean rewardPointsDisabled) {
        this.rewardPointsDisabled = rewardPointsDisabled;
    }

    public Boolean getPosCouponsDisabled() {
        return posCouponsDisabled;
    }

    public void setPosCouponsDisabled(Boolean posCouponsDisabled) {
        this.posCouponsDisabled = posCouponsDisabled;
    }

    public String getLastModifierUsername() {
        return lastModifierUsername;
    }

    public void setLastModifierUsername(String lastModifierUsername) {
        this.lastModifierUsername = lastModifierUsername;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<ContactPerson> getContactPersons() {
        return contactPersons;
    }

    public void setContactPersons(List<ContactPerson> contactPersons) {
        this.contactPersons = contactPersons;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Attribute> getLongAttributes() {
        return longAttributes;
    }

    public void setLongAttributes(List<Attribute> longAttributes) {
        this.longAttributes = longAttributes;
    }

    public BigDecimal getActualBalance() {
        return actualBalance;
    }

    public void setActualBalance(BigDecimal actualBalance) {
        this.actualBalance = actualBalance;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getAvailableCredit() {
        return availableCredit;
    }

    public void setAvailableCredit(BigDecimal availableCredit) {
        this.availableCredit = availableCredit;
    }

    public Boolean getCreditAllowed() {
        return creditAllowed;
    }

    public void setCreditAllowed(Boolean creditAllowed) {
        this.creditAllowed = creditAllowed;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebshopUsername() {
        return webshopUsername;
    }

    public void setWebshopUsername(String webshopUsername) {
        this.webshopUsername = webshopUsername;
    }

    public String getWebshopLastLogin() {
        return webshopLastLogin;
    }

    public void setWebshopLastLogin(String webshopLastLogin) {
        this.webshopLastLogin = webshopLastLogin;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankIBAN() {
        return bankIBAN;
    }

    public void setBankIBAN(String bankIBAN) {
        this.bankIBAN = bankIBAN;
    }

    public String getBankSWIFT() {
        return bankSWIFT;
    }

    public void setBankSWIFT(String bankSWIFT) {
        this.bankSWIFT = bankSWIFT;
    }

    public Integer getJobTitleID() {
        return jobTitleID;
    }

    public void setJobTitleID(Integer jobTitleID) {
        this.jobTitleID = jobTitleID;
    }

    public String getJobTitleName() {
        return jobTitleName;
    }

    public void setJobTitleName(String jobTitleName) {
        this.jobTitleName = jobTitleName;
    }

    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public Integer getCustomerManagerID() {
        return customerManagerID;
    }

    public void setCustomerManagerID(Integer customerManagerID) {
        this.customerManagerID = customerManagerID;
    }

    public String getCustomerManagerName() {
        return customerManagerName;
    }

    public void setCustomerManagerName(String customerManagerName) {
        this.customerManagerName = customerManagerName;
    }

    public Integer getPaymentDays() {
        return paymentDays;
    }

    public void setPaymentDays(Integer paymentDays) {
        this.paymentDays = paymentDays;
    }

    public String getPenaltyPerDay() {
        return penaltyPerDay;
    }

    public void setPenaltyPerDay(String penaltyPerDay) {
        this.penaltyPerDay = penaltyPerDay;
    }

    public Integer getPriceListID() {
        return priceListID;
    }

    public void setPriceListID(Integer priceListID) {
        this.priceListID = priceListID;
    }

    public Integer getPriceListID2() {
        return priceListID2;
    }

    public void setPriceListID2(Integer priceListID2) {
        this.priceListID2 = priceListID2;
    }

    public Integer getPriceListID3() {
        return priceListID3;
    }

    public void setPriceListID3(Integer priceListID3) {
        this.priceListID3 = priceListID3;
    }

    public Boolean getOutsideEU() {
        return outsideEU;
    }

    public void setOutsideEU(Boolean outsideEU) {
        this.outsideEU = outsideEU;
    }

    public Integer getBusinessAreaID() {
        return businessAreaID;
    }

    public void setBusinessAreaID(Integer businessAreaID) {
        this.businessAreaID = businessAreaID;
    }

    public String getBusinessAreaName() {
        return businessAreaName;
    }

    public void setBusinessAreaName(String businessAreaName) {
        this.businessAreaName = businessAreaName;
    }

    public Integer getDeliveryTypeID() {
        return deliveryTypeID;
    }

    public void setDeliveryTypeID(Integer deliveryTypeID) {
        this.deliveryTypeID = deliveryTypeID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getLastModifierEmployeeID() {
        return lastModifierEmployeeID;
    }

    public void setLastModifierEmployeeID(Integer lastModifierEmployeeID) {
        this.lastModifierEmployeeID = lastModifierEmployeeID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
