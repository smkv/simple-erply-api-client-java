package ee.smkv.erply.api.client.models;

import java.util.Date;
import java.util.List;

public class Address {
  private Integer addressID;
  private Integer ownerID;
  private Integer typeID;
  private String typeName;
  private Boolean typeActivelyUsed;
  private String street;
  private String address2;
  private String city;
  private String postalCode;
  private String state;
  private String country;
  private Date added;
  private Date lastModified;
  private String lastModifierUsername;
  private Integer lastModifierEmployeeID;
  private List<Attribute> attributes;

  public Integer getAddressID() {
    return addressID;
  }

  public void setAddressID(Integer addressID) {
    this.addressID = addressID;
  }

  public Integer getOwnerID() {
    return ownerID;
  }

  public void setOwnerID(Integer ownerID) {
    this.ownerID = ownerID;
  }

  public Integer getTypeID() {
    return typeID;
  }

  public void setTypeID(Integer typeID) {
    this.typeID = typeID;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Boolean getTypeActivelyUsed() {
    return typeActivelyUsed;
  }

  public void setTypeActivelyUsed(Boolean typeActivelyUsed) {
    this.typeActivelyUsed = typeActivelyUsed;
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

  public String getLastModifierUsername() {
    return lastModifierUsername;
  }

  public void setLastModifierUsername(String lastModifierUsername) {
    this.lastModifierUsername = lastModifierUsername;
  }

  public Integer getLastModifierEmployeeID() {
    return lastModifierEmployeeID;
  }

  public void setLastModifierEmployeeID(Integer lastModifierEmployeeID) {
    this.lastModifierEmployeeID = lastModifierEmployeeID;
  }

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }
}
