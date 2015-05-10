package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductCategoriesResponse;

import java.util.Date;

public class GetProductCategoriesRequest extends Request<ProductCategoriesResponse> {

    private Integer parentCategoryID;
    private String searchAttributeName;
    private String searchAttributeValue;
    private Date changedSince;
    private Integer recordsOnPage;
    private Integer pageNo;

    public GetProductCategoriesRequest() {
        super("getProductCategories");
    }

    @Override
    public Class<ProductCategoriesResponse> getResponseClass() {
        return ProductCategoriesResponse.class;
    }

    public Integer getParentCategoryID() {
        return parentCategoryID;
    }

    public void setParentCategoryID(Integer parentCategoryID) {
        this.parentCategoryID = parentCategoryID;
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

    public Date getChangedSince() {
        return changedSince;
    }

    public void setChangedSince(Date changedSince) {
        this.changedSince = changedSince;
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
