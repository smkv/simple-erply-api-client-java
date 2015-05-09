package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductPriorityGroupsResponse;

import java.util.Date;

public class GetProductPriorityGroups extends Request<ProductPriorityGroupsResponse> {
    
    private Date changedSince;
    private Integer recordsOnPage;
    private Integer pageNo;
    
    public GetProductPriorityGroups() {
        super("getProductPriorityGroups");
    }

    @Override
    public Class<ProductPriorityGroupsResponse> getResponseClass() {
        return ProductPriorityGroupsResponse.class;
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
