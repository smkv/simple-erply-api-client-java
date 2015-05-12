package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.AddressesResponse;

import java.util.Date;

public class GetAddressesRequest extends Request<AddressesResponse> {
  private final Integer ownerID;
  private Integer typeID;
  private String searchAttributeName;
  private String searchAttributeValue;
  private Date addedSince;
  private Date changedSince;
  private Language lang;
  private String orderBy;
  private OrderByDirection orderByDir;
  private Integer recordsOnPage;
  private Integer pageNo;

  public GetAddressesRequest(Integer ownerID) {
    super("getAddresses");
    this.ownerID = ownerID;
  }

  @Override
  public Class<AddressesResponse> getResponseClass() {
    return AddressesResponse.class;
  }

  public Integer getOwnerID() {
    return ownerID;
  }

  public Integer getTypeID() {
    return typeID;
  }

  public void setTypeID(Integer typeID) {
    this.typeID = typeID;
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

  public Date getAddedSince() {
    return addedSince;
  }

  public void setAddedSince(Date addedSince) {
    this.addedSince = addedSince;
  }

  public Date getChangedSince() {
    return changedSince;
  }

  public void setChangedSince(Date changedSince) {
    this.changedSince = changedSince;
  }

  public Language getLang() {
    return lang;
  }

  public void setLang(Language lang) {
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
}
