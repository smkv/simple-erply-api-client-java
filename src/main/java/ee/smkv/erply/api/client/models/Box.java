package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;

public class Box {
    private String barcode;
    private Integer amount;
    private BigDecimal netomass;
    private BigDecimal brutomass;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getNetomass() {
        return netomass;
    }

    public void setNetomass(BigDecimal netomass) {
        this.netomass = netomass;
    }

    public BigDecimal getBrutomass() {
        return brutomass;
    }

    public void setBrutomass(BigDecimal brutomass) {
        this.brutomass = brutomass;
    }

    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }
}
