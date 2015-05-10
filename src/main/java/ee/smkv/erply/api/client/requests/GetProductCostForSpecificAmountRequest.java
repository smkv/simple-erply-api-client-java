package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductCostForSpecificAmountResponse;

import java.math.BigDecimal;
import java.util.List;

public class GetProductCostForSpecificAmountRequest extends Request<ProductCostForSpecificAmountResponse> {
    private final Integer warehouseID;
    private List<ProductAmount> productAmountList;

    public GetProductCostForSpecificAmountRequest(Integer warehouseID) {
        super("getProductCostForSpecificAmount");
        this.warehouseID = warehouseID;
    }

    @Override
    public Class<ProductCostForSpecificAmountResponse> getResponseClass() {
        return ProductCostForSpecificAmountResponse.class;
    }

    public List<ProductAmount> getProductAmountList() {
        return productAmountList;
    }

    public void setProductAmountList(List<ProductAmount> productAmountList) {
        this.productAmountList = productAmountList;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public static class ProductAmount {
        private Integer productID;
        private BigDecimal amount;

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public Integer getProductID() {
            return productID;
        }

        public void setProductID(Integer productID) {
            this.productID = productID;
        }
    }
}
