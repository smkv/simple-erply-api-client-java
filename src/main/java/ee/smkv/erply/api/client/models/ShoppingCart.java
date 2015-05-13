package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

    private List<ShoppingCartRow> rows;
    private BigDecimal netTotal;
    private BigDecimal vatTotal;
    private BigDecimal rounding;
    private BigDecimal total;
    private String automaticCoupons;
    private List<AutomaticCoupon> printAutomaticCoupons;
    private String usedCouponIdentifiers;
    private List<Promotion> appliedPromotions;
    private String information;
    private Integer freeExtraProductID;
    private String freeExtraProductCode;
    private String freeExtraProductName;
    private String freeExtraNotification;


    public List<ShoppingCartRow> getRows() {
        return rows;
    }

    public void setRows(List<ShoppingCartRow> rows) {
        this.rows = rows;
    }

    public BigDecimal getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(BigDecimal netTotal) {
        this.netTotal = netTotal;
    }

    public BigDecimal getVatTotal() {
        return vatTotal;
    }

    public void setVatTotal(BigDecimal vatTotal) {
        this.vatTotal = vatTotal;
    }

    public BigDecimal getRounding() {
        return rounding;
    }

    public void setRounding(BigDecimal rounding) {
        this.rounding = rounding;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getAutomaticCoupons() {
        return automaticCoupons;
    }

    public void setAutomaticCoupons(String automaticCoupons) {
        this.automaticCoupons = automaticCoupons;
    }

    public List<AutomaticCoupon> getPrintAutomaticCoupons() {
        return printAutomaticCoupons;
    }

    public void setPrintAutomaticCoupons(List<AutomaticCoupon> printAutomaticCoupons) {
        this.printAutomaticCoupons = printAutomaticCoupons;
    }

    public String getUsedCouponIdentifiers() {
        return usedCouponIdentifiers;
    }

    public void setUsedCouponIdentifiers(String usedCouponIdentifiers) {
        this.usedCouponIdentifiers = usedCouponIdentifiers;
    }

    public List<Promotion> getAppliedPromotions() {
        return appliedPromotions;
    }

    public void setAppliedPromotions(List<Promotion> appliedPromotions) {
        this.appliedPromotions = appliedPromotions;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Integer getFreeExtraProductID() {
        return freeExtraProductID;
    }

    public void setFreeExtraProductID(Integer freeExtraProductID) {
        this.freeExtraProductID = freeExtraProductID;
    }

    public String getFreeExtraProductCode() {
        return freeExtraProductCode;
    }

    public void setFreeExtraProductCode(String freeExtraProductCode) {
        this.freeExtraProductCode = freeExtraProductCode;
    }

    public String getFreeExtraProductName() {
        return freeExtraProductName;
    }

    public void setFreeExtraProductName(String freeExtraProductName) {
        this.freeExtraProductName = freeExtraProductName;
    }

    public String getFreeExtraNotification() {
        return freeExtraNotification;
    }

    public void setFreeExtraNotification(String freeExtraNotification) {
        this.freeExtraNotification = freeExtraNotification;
    }

    public static class ShoppingCartRow {
        private Integer rowNumber;
        private Integer productID;
        private BigDecimal amount;
        private Integer vatrateID;
        private BigDecimal vatRate;
        private BigDecimal originalPrice;
        private BigDecimal originalPriceWithVAT;
        private BigDecimal promotionDiscount;
        private BigDecimal manualDiscount;
        private BigDecimal discount;
        private BigDecimal finalPrice;
        private BigDecimal finalPriceWithVAT;
        private BigDecimal priceBasedTaxThreshold;
        private BigDecimal priceBasedTaxRate;
        private BigDecimal rowNetTotal;
        private BigDecimal rowVAT;
        private BigDecimal rowTotal;

        public Integer getRowNumber() {
            return rowNumber;
        }

        public void setRowNumber(Integer rowNumber) {
            this.rowNumber = rowNumber;
        }

        public Integer getProductID() {
            return productID;
        }

        public void setProductID(Integer productID) {
            this.productID = productID;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }

        public Integer getVatrateID() {
            return vatrateID;
        }

        public void setVatrateID(Integer vatrateID) {
            this.vatrateID = vatrateID;
        }

        public BigDecimal getVatRate() {
            return vatRate;
        }

        public void setVatRate(BigDecimal vatRate) {
            this.vatRate = vatRate;
        }

        public BigDecimal getOriginalPrice() {
            return originalPrice;
        }

        public void setOriginalPrice(BigDecimal originalPrice) {
            this.originalPrice = originalPrice;
        }

        public BigDecimal getOriginalPriceWithVAT() {
            return originalPriceWithVAT;
        }

        public void setOriginalPriceWithVAT(BigDecimal originalPriceWithVAT) {
            this.originalPriceWithVAT = originalPriceWithVAT;
        }

        public BigDecimal getPromotionDiscount() {
            return promotionDiscount;
        }

        public void setPromotionDiscount(BigDecimal promotionDiscount) {
            this.promotionDiscount = promotionDiscount;
        }

        public BigDecimal getManualDiscount() {
            return manualDiscount;
        }

        public void setManualDiscount(BigDecimal manualDiscount) {
            this.manualDiscount = manualDiscount;
        }

        public BigDecimal getDiscount() {
            return discount;
        }

        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }

        public BigDecimal getFinalPrice() {
            return finalPrice;
        }

        public void setFinalPrice(BigDecimal finalPrice) {
            this.finalPrice = finalPrice;
        }

        public BigDecimal getFinalPriceWithVAT() {
            return finalPriceWithVAT;
        }

        public void setFinalPriceWithVAT(BigDecimal finalPriceWithVAT) {
            this.finalPriceWithVAT = finalPriceWithVAT;
        }

        public BigDecimal getPriceBasedTaxThreshold() {
            return priceBasedTaxThreshold;
        }

        public void setPriceBasedTaxThreshold(BigDecimal priceBasedTaxThreshold) {
            this.priceBasedTaxThreshold = priceBasedTaxThreshold;
        }

        public BigDecimal getPriceBasedTaxRate() {
            return priceBasedTaxRate;
        }

        public void setPriceBasedTaxRate(BigDecimal priceBasedTaxRate) {
            this.priceBasedTaxRate = priceBasedTaxRate;
        }

        public BigDecimal getRowNetTotal() {
            return rowNetTotal;
        }

        public void setRowNetTotal(BigDecimal rowNetTotal) {
            this.rowNetTotal = rowNetTotal;
        }

        public BigDecimal getRowVAT() {
            return rowVAT;
        }

        public void setRowVAT(BigDecimal rowVAT) {
            this.rowVAT = rowVAT;
        }

        public BigDecimal getRowTotal() {
            return rowTotal;
        }

        public void setRowTotal(BigDecimal rowTotal) {
            this.rowTotal = rowTotal;
        }
    }

    public static class AutomaticCoupon {
        private Integer couponID;
        private BigDecimal printingCostInRewardPoints;

        public Integer getCouponID() {
            return couponID;
        }

        public void setCouponID(Integer couponID) {
            this.couponID = couponID;
        }

        public BigDecimal getPrintingCostInRewardPoints() {
            return printingCostInRewardPoints;
        }

        public void setPrintingCostInRewardPoints(BigDecimal printingCostInRewardPoints) {
            this.printingCostInRewardPoints = printingCostInRewardPoints;
        }
    }

    public static class Promotion {
        private Integer promotionID;
        private Integer count;
        private Integer rewardPoints;

        public Integer getPromotionID() {
            return promotionID;
        }

        public void setPromotionID(Integer promotionID) {
            this.promotionID = promotionID;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getRewardPoints() {
            return rewardPoints;
        }

        public void setRewardPoints(Integer rewardPoints) {
            this.rewardPoints = rewardPoints;
        }
    }
}
