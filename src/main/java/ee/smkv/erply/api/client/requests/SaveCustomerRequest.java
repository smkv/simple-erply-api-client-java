package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.models.Attribute;
import ee.smkv.erply.api.client.models.Gender;
import ee.smkv.erply.api.client.models.LongAttribute;
import ee.smkv.erply.api.client.responses.SaveCustomerResponse;

import java.util.Date;
import java.util.List;

public class SaveCustomerRequest extends Request<SaveCustomerResponse> {

  private Integer customerID;
  private String companyName;
  private String firstName;
  private String lastName;
  private String fullName;
  private Gender gender;
  private Integer groupID;
  private String code;
  private String vatNumber;
  private String email;
  private String phone;
  private String mobile;
  private String fax;
  private String skype;
  private byte[] imageContent;
  private String imageMimeType;
  private String website;
  private String bankName;
  private String bankAccountNumber;
  private String bankIBAN;
  private String bankSWIFT;

  private Date birthday;
  private Integer jobTitleID;
  private Integer companyID;
  private Integer customerManagerID;
  private Integer invoicePayerID;
  private Integer paymentDays;
  private String penaltyPerDay;
  private Integer credit;
  private Boolean salesBlocked;
  private String referenceNumber;
  private String customerCardNumber;
  private Integer priceListID;
  private Integer priceListID2;
  private Integer priceListID3;
  private String euCustomerType;
  private Boolean outsideEU;
  private Integer businessAreaID;
  private Integer countryID;
  private String notes;
  private String username;
  private String password;
  private Boolean flagStatus;
  private String colorStatus;
  private String twitterID;
  private String facebookName;
  private String creditCardLastNumbers;
  private Integer deliveryTypeID;
  private Boolean rewardPointsDisabled;
  private Boolean posCouponsDisabled;
  private List<Attribute> attributes;
  private List<LongAttribute> longAttributes;


  public SaveCustomerRequest() {
    super("saveCustomer");
  }

  @Override
  public Class<SaveCustomerResponse> getResponseClass() {
    return SaveCustomerResponse.class;
  }


  public Integer getCustomerID() {
    return customerID;
  }

  public void setCustomerID(Integer customerID) {
    this.customerID = customerID;
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

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
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

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getVatNumber() {
    return vatNumber;
  }

  public void setVatNumber(String vatNumber) {
    this.vatNumber = vatNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getSkype() {
    return skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public byte[] getImageContent() {
    return imageContent;
  }

  public void setImageContent(byte[] imageContent) {
    this.imageContent = imageContent;
  }

  public String getImageMimeType() {
    return imageMimeType;
  }

  public void setImageMimeType(String imageMimeType) {
    this.imageMimeType = imageMimeType;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
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

  @Parameter(value = "birthday",format = "yyyy-MM-dd")
  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getJobTitleID() {
    return jobTitleID;
  }

  public void setJobTitleID(Integer jobTitleID) {
    this.jobTitleID = jobTitleID;
  }

  public Integer getCompanyID() {
    return companyID;
  }

  public void setCompanyID(Integer companyID) {
    this.companyID = companyID;
  }

  public Integer getCustomerManagerID() {
    return customerManagerID;
  }

  public void setCustomerManagerID(Integer customerManagerID) {
    this.customerManagerID = customerManagerID;
  }

  public Integer getInvoicePayerID() {
    return invoicePayerID;
  }

  public void setInvoicePayerID(Integer invoicePayerID) {
    this.invoicePayerID = invoicePayerID;
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

  public String getEuCustomerType() {
    return euCustomerType;
  }

  public void setEuCustomerType(String euCustomerType) {
    this.euCustomerType = euCustomerType;
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

  public Integer getCountryID() {
    return countryID;
  }

  public void setCountryID(Integer countryID) {
    this.countryID = countryID;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public Integer getDeliveryTypeID() {
    return deliveryTypeID;
  }

  public void setDeliveryTypeID(Integer deliveryTypeID) {
    this.deliveryTypeID = deliveryTypeID;
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

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }

  public List<LongAttribute> getLongAttributes() {
    return longAttributes;
  }

  public void setLongAttributes(List<LongAttribute> longAttributes) {
    this.longAttributes = longAttributes;
  }
}
