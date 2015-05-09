package ee.smkv.erply.api.client.models;


import java.util.Date;

public class ProductPriorityGroup {
    private Integer priorityGroupID;
    private String priorityGroupName;
    private Date added;
    private Date lastModified;

    public Integer getPriorityGroupID() {
        return priorityGroupID;
    }

    public void setPriorityGroupID(Integer priorityGroupID) {
        this.priorityGroupID = priorityGroupID;
    }

    public String getPriorityGroupName() {
        return priorityGroupName;
    }

    public void setPriorityGroupName(String priorityGroupName) {
        this.priorityGroupName = priorityGroupName;
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
