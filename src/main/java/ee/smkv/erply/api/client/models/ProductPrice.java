package ee.smkv.erply.api.client.models;


import java.math.BigDecimal;

public class ProductPrice {
    private Integer productID;
    private BigDecimal defaultPrice;
    private BigDecimal defaultPriceWithVAT;
    private BigDecimal specialPrice;
    private BigDecimal specialPriceWithVAT;

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public BigDecimal getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(BigDecimal defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public BigDecimal getDefaultPriceWithVAT() {
        return defaultPriceWithVAT;
    }

    public void setDefaultPriceWithVAT(BigDecimal defaultPriceWithVAT) {
        this.defaultPriceWithVAT = defaultPriceWithVAT;
    }

    public BigDecimal getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(BigDecimal specialPrice) {
        this.specialPrice = specialPrice;
    }

    public BigDecimal getSpecialPriceWithVAT() {
        return specialPriceWithVAT;
    }

    public void setSpecialPriceWithVAT(BigDecimal specialPriceWithVAT) {
        this.specialPriceWithVAT = specialPriceWithVAT;
    }
}
