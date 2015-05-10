package ee.smkv.erply.api.client.models;


import java.math.BigDecimal;

public class ProductCostForSpecificAmount {
    private Integer productID;
    private BigDecimal amount;
    private BigDecimal cost;
    private BigDecimal amountActuallyInStock;
    private Boolean costIsPreliminary;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountActuallyInStock() {
        return amountActuallyInStock;
    }

    public void setAmountActuallyInStock(BigDecimal amountActuallyInStock) {
        this.amountActuallyInStock = amountActuallyInStock;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Boolean getCostIsPreliminary() {
        return costIsPreliminary;
    }

    public void setCostIsPreliminary(Boolean costIsPreliminary) {
        this.costIsPreliminary = costIsPreliminary;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }
}
