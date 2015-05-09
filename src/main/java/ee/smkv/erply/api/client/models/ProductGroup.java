package ee.smkv.erply.api.client.models;


import java.util.List;

public class ProductGroup {

    private Integer productGroupID;
    private String name;
    private Boolean showInWebshop;
    private Integer positionNo;
    private Integer parentGroupID;
    private List<Image> images;
    private List<Integer> subGroups;
    private List<Attribute> attributes;
    private List<WarehouseRate> vatrates;

    public Integer getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(Integer productGroupID) {
        this.productGroupID = productGroupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getShowInWebshop() {
        return showInWebshop;
    }

    public void setShowInWebshop(Boolean showInWebshop) {
        this.showInWebshop = showInWebshop;
    }

    public Integer getPositionNo() {
        return positionNo;
    }

    public void setPositionNo(Integer positionNo) {
        this.positionNo = positionNo;
    }

    public Integer getParentGroupID() {
        return parentGroupID;
    }

    public void setParentGroupID(Integer parentGroupID) {
        this.parentGroupID = parentGroupID;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Integer> getSubGroups() {
        return subGroups;
    }

    public void setSubGroups(List<Integer> subGroups) {
        this.subGroups = subGroups;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<WarehouseRate> getVatrates() {
        return vatrates;
    }

    public void setVatrates(List<WarehouseRate> vatrates) {
        this.vatrates = vatrates;
    }
}
