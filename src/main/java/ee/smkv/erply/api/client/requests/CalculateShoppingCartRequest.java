package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.models.SalesDocumentType;
import ee.smkv.erply.api.client.responses.ShoppingCartResponse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CalculateShoppingCartRequest extends Request<ShoppingCartResponse> {
    
    private Integer documentID;
    private SalesDocumentType type;
    private Date date;
    private Integer warehouseID;
    private Integer pointOfSaleID;
    private Integer customerID;
    private Boolean getAutomaticCoupons;
    private List<String> couponIdentifiers;
    private List<Integer> manualPromotionIDs;
    private Boolean doNotApplyInvoiceLevelPromotions;
    private Boolean taxExempt;
    private List<InvoiceLine> lines;

    
    public CalculateShoppingCartRequest() {
        super("calculateShoppingCart");
    }

    @Override
    public Class<ShoppingCartResponse> getResponseClass() {
        return ShoppingCartResponse.class;
    }


    public Integer getDocumentID() {
        return documentID;
    }

    public void setDocumentID(Integer documentID) {
        this.documentID = documentID;
    }

    public SalesDocumentType getType() {
        return type;
    }

    public void setType(SalesDocumentType type) {
        this.type = type;
    }

    @Parameter(value = "date" , format = ISO_DATE_FORMAT)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Integer getPointOfSaleID() {
        return pointOfSaleID;
    }

    public void setPointOfSaleID(Integer pointOfSaleID) {
        this.pointOfSaleID = pointOfSaleID;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public Boolean getGetAutomaticCoupons() {
        return getAutomaticCoupons;
    }

    public void setGetAutomaticCoupons(Boolean getAutomaticCoupons) {
        this.getAutomaticCoupons = getAutomaticCoupons;
    }

    public List<String> getCouponIdentifiers() {
        return couponIdentifiers;
    }

    public void setCouponIdentifiers(List<String> couponIdentifiers) {
        this.couponIdentifiers = couponIdentifiers;
    }

    public List<Integer> getManualPromotionIDs() {
        return manualPromotionIDs;
    }

    public void setManualPromotionIDs(List<Integer> manualPromotionIDs) {
        this.manualPromotionIDs = manualPromotionIDs;
    }

    public Boolean getDoNotApplyInvoiceLevelPromotions() {
        return doNotApplyInvoiceLevelPromotions;
    }

    public void setDoNotApplyInvoiceLevelPromotions(Boolean doNotApplyInvoiceLevelPromotions) {
        this.doNotApplyInvoiceLevelPromotions = doNotApplyInvoiceLevelPromotions;
    }

    public Boolean getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public List<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(List<InvoiceLine> lines) {
        this.lines = lines;
    }

    public static class InvoiceLine {
        private final Integer productID;
        private final BigDecimal amount;
        private BigDecimal price;
        private BigDecimal discount;
        private Integer vatrateID;

        public InvoiceLine(Integer productID, BigDecimal amount) {
            this.productID = productID;
            this.amount = amount;
        }

        public Integer getProductID() {
            return productID;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        public BigDecimal getDiscount() {
            return discount;
        }

        public void setDiscount(BigDecimal discount) {
            this.discount = discount;
        }

        public Integer getVatrateID() {
            return vatrateID;
        }

        public void setVatrateID(Integer vatrateID) {
            this.vatrateID = vatrateID;
        }
    }
}
