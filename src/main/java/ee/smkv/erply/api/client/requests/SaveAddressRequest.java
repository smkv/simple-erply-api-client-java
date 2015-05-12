package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.models.Attribute;
import ee.smkv.erply.api.client.responses.SaveAddressResponse;


import java.util.List;

public class SaveAddressRequest extends Request<SaveAddressResponse> {

  private Integer addressID;
  private final Integer ownerID;
  private final Integer typeID;
  private String street;
  private String address2;
  private String city;
  private String postalCode;
  private String state;
  private String country;
  private List<Attribute> attributes;

  public SaveAddressRequest(Integer ownerID, Integer typeID) {
    super("saveAddress");
    this.ownerID = ownerID;
    this.typeID = typeID;
  }

  @Override
  public Class<SaveAddressResponse> getResponseClass() {
    return SaveAddressResponse.class;
  }

  public Integer getAddressID() {
    return addressID;
  }

  public void setAddressID(Integer addressID) {
    this.addressID = addressID;
  }

  public Integer getOwnerID() {
    return ownerID;
  }

  public Integer getTypeID() {
    return typeID;
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

  public List<Attribute> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<Attribute> attributes) {
    this.attributes = attributes;
  }
}
