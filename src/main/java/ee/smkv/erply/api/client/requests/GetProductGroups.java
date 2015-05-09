package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductGroupsResponse;

import java.util.Date;

public class GetProductGroups extends Request<ProductGroupsResponse> {
    
    private Integer productGroupID;
    private Date changedSince;
    private String searchAttributeName;
    private String searchAttributeValue;
    private String lang;
    private Boolean getAllLanguages;

    
    public GetProductGroups() {
        super("getProductGroups");
    }

    @Override
    public Class<ProductGroupsResponse> getResponseClass() {
        return ProductGroupsResponse.class;
    }


    public Integer getProductGroupID() {
        return productGroupID;
    }

    public void setProductGroupID(Integer productGroupID) {
        this.productGroupID = productGroupID;
    }

    public Date getChangedSince() {
        return changedSince;
    }

    public void setChangedSince(Date changedSince) {
        this.changedSince = changedSince;
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

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getGetAllLanguages() {
        return getAllLanguages;
    }

    public void setGetAllLanguages(Boolean getAllLanguages) {
        this.getAllLanguages = getAllLanguages;
    }
}
