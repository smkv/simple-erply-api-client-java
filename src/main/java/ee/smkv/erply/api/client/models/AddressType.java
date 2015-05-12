package ee.smkv.erply.api.client.models;

import java.util.Date;

public class AddressType {
  private Integer id;
  private String name;
  private Boolean activelyUsed;
  private Date added;
  private Date lastModified;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getActivelyUsed() {
    return activelyUsed;
  }

  public void setActivelyUsed(Boolean activelyUsed) {
    this.activelyUsed = activelyUsed;
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
}
