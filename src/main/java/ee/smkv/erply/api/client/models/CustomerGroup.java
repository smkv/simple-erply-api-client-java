package ee.smkv.erply.api.client.models;

import java.util.Date;

public class CustomerGroup {
    private Integer customerGroupID;
    private Integer parentID;
    private String name;
    private Integer pricelistID;
    private Date added;
    private Date lastModified;

    public Integer getCustomerGroupID() {
        return customerGroupID;
    }

    public void setCustomerGroupID(Integer customerGroupID) {
        this.customerGroupID = customerGroupID;
    }

    public Integer getParentID() {
        return parentID;
    }

    public void setParentID(Integer parentID) {
        this.parentID = parentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPricelistID() {
        return pricelistID;
    }

    public void setPricelistID(Integer pricelistID) {
        this.pricelistID = pricelistID;
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
