package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.models.*;
import ee.smkv.erply.api.client.responses.SaveProductResponse;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SaveProductRequest extends Request<SaveProductResponse> {
    
    private Integer productID;
    private ProductType type;
    private final Integer groupID;
    private Integer unitID;
    private Integer brandID;
    private Integer supplierID;
    private Integer vatrateID;
    private Boolean taxFree;
    private String code;
    private String code2;
    private String code3;
    private String supplierCode;
    private Boolean active;
    private ProductStatus status;
    private Boolean displayedInWebshop;
    private String name;
    private String nameEST;
    private String nameENG;
    private String nameLAT;
    private String nameRUS;
    private String nameFIN;
    private String nameGRE;
    private String description;
    private String descriptionEST;
    private String descriptionENG;
    private String descriptionRUS;
    private String descriptionFIN;
    private String longdesc;
    private String longdescEST;
    private String longdescENG;
    private String longdescRUS;
    private String longdescFIN;
    private Integer length;
    private Integer width;
    private Integer height;
    private BigDecimal netWeight;
    private BigDecimal grossWeight;
    private Integer volume;
    private BigDecimal netPrice;
    private BigDecimal priceWithVAT;
    private Boolean hasQuickSelectButton;
    private Boolean isGiftCard;
    private Boolean isRegularGiftCard;
    private Integer lengthInMinutes;
    private Integer setupTimeInMinutes;
    private Integer cleanupTimeInMinutes;
    private Boolean rewardPointsNotAllowed;
    private BigDecimal cost;
    private String manufacturerName;
    private Integer categoryID;
    private Integer priorityGroupID;
    private Integer countryOfOriginID;
    private Integer containerID;
    private Integer containerAmount;
    private String deliveryTime;
    private BigDecimal backbarCharges;
    private Boolean labelsNotNeeded;
    private Boolean nonStockProduct;
    private Boolean walkInService;
    private Map<Integer,BigDecimal> reorderPoint;
    private Map<Integer,BigDecimal> restockLevel;
    private List<Integer> replacementProductIDs;
    private List<Integer> relatedProductIDs;
    private Integer parentProductID;
    private List<MatrixDimension> dimentions;
    private List<Attribute> attributes;
    private List<ProductComponent> components;

    
    public SaveProductRequest(Integer groupID) {
        super("saveProduct");
        this.groupID = groupID;
    }

    @Override
    public Class<SaveProductResponse> getResponseClass() {
        return SaveProductResponse.class;
    }


    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public Integer getVatrateID() {
        return vatrateID;
    }

    public void setVatrateID(Integer vatrateID) {
        this.vatrateID = vatrateID;
    }

    public Boolean getTaxFree() {
        return taxFree;
    }

    public void setTaxFree(Boolean taxFree) {
        this.taxFree = taxFree;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Boolean getDisplayedInWebshop() {
        return displayedInWebshop;
    }

    public void setDisplayedInWebshop(Boolean displayedInWebshop) {
        this.displayedInWebshop = displayedInWebshop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEST() {
        return nameEST;
    }

    public void setNameEST(String nameEST) {
        this.nameEST = nameEST;
    }

    public String getNameENG() {
        return nameENG;
    }

    public void setNameENG(String nameENG) {
        this.nameENG = nameENG;
    }

    public String getNameLAT() {
        return nameLAT;
    }

    public void setNameLAT(String nameLAT) {
        this.nameLAT = nameLAT;
    }

    public String getNameRUS() {
        return nameRUS;
    }

    public void setNameRUS(String nameRUS) {
        this.nameRUS = nameRUS;
    }

    public String getNameFIN() {
        return nameFIN;
    }

    public void setNameFIN(String nameFIN) {
        this.nameFIN = nameFIN;
    }

    public String getNameGRE() {
        return nameGRE;
    }

    public void setNameGRE(String nameGRE) {
        this.nameGRE = nameGRE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionEST() {
        return descriptionEST;
    }

    public void setDescriptionEST(String descriptionEST) {
        this.descriptionEST = descriptionEST;
    }

    public String getDescriptionENG() {
        return descriptionENG;
    }

    public void setDescriptionENG(String descriptionENG) {
        this.descriptionENG = descriptionENG;
    }

    public String getDescriptionRUS() {
        return descriptionRUS;
    }

    public void setDescriptionRUS(String descriptionRUS) {
        this.descriptionRUS = descriptionRUS;
    }

    public String getDescriptionFIN() {
        return descriptionFIN;
    }

    public void setDescriptionFIN(String descriptionFIN) {
        this.descriptionFIN = descriptionFIN;
    }

    public String getLongdesc() {
        return longdesc;
    }

    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    public String getLongdescEST() {
        return longdescEST;
    }

    public void setLongdescEST(String longdescEST) {
        this.longdescEST = longdescEST;
    }

    public String getLongdescENG() {
        return longdescENG;
    }

    public void setLongdescENG(String longdescENG) {
        this.longdescENG = longdescENG;
    }

    public String getLongdescRUS() {
        return longdescRUS;
    }

    public void setLongdescRUS(String longdescRUS) {
        this.longdescRUS = longdescRUS;
    }

    public String getLongdescFIN() {
        return longdescFIN;
    }

    public void setLongdescFIN(String longdescFIN) {
        this.longdescFIN = longdescFIN;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public BigDecimal getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(BigDecimal grossWeight) {
        this.grossWeight = grossWeight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public BigDecimal getPriceWithVAT() {
        return priceWithVAT;
    }

    public void setPriceWithVAT(BigDecimal priceWithVAT) {
        this.priceWithVAT = priceWithVAT;
    }

    public Boolean getHasQuickSelectButton() {
        return hasQuickSelectButton;
    }

    public void setHasQuickSelectButton(Boolean hasQuickSelectButton) {
        this.hasQuickSelectButton = hasQuickSelectButton;
    }

    public Boolean getIsGiftCard() {
        return isGiftCard;
    }

    public void setIsGiftCard(Boolean isGiftCard) {
        this.isGiftCard = isGiftCard;
    }

    public Boolean getIsRegularGiftCard() {
        return isRegularGiftCard;
    }

    public void setIsRegularGiftCard(Boolean isRegularGiftCard) {
        this.isRegularGiftCard = isRegularGiftCard;
    }

    public Integer getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(Integer lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public Integer getSetupTimeInMinutes() {
        return setupTimeInMinutes;
    }

    public void setSetupTimeInMinutes(Integer setupTimeInMinutes) {
        this.setupTimeInMinutes = setupTimeInMinutes;
    }

    public Integer getCleanupTimeInMinutes() {
        return cleanupTimeInMinutes;
    }

    public void setCleanupTimeInMinutes(Integer cleanupTimeInMinutes) {
        this.cleanupTimeInMinutes = cleanupTimeInMinutes;
    }

    public Boolean getRewardPointsNotAllowed() {
        return rewardPointsNotAllowed;
    }

    public void setRewardPointsNotAllowed(Boolean rewardPointsNotAllowed) {
        this.rewardPointsNotAllowed = rewardPointsNotAllowed;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getPriorityGroupID() {
        return priorityGroupID;
    }

    public void setPriorityGroupID(Integer priorityGroupID) {
        this.priorityGroupID = priorityGroupID;
    }

    public Integer getCountryOfOriginID() {
        return countryOfOriginID;
    }

    public void setCountryOfOriginID(Integer countryOfOriginID) {
        this.countryOfOriginID = countryOfOriginID;
    }

    public Integer getContainerID() {
        return containerID;
    }

    public void setContainerID(Integer containerID) {
        this.containerID = containerID;
    }

    public Integer getContainerAmount() {
        return containerAmount;
    }

    public void setContainerAmount(Integer containerAmount) {
        this.containerAmount = containerAmount;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public BigDecimal getBackbarCharges() {
        return backbarCharges;
    }

    public void setBackbarCharges(BigDecimal backbarCharges) {
        this.backbarCharges = backbarCharges;
    }

    public Boolean getLabelsNotNeeded() {
        return labelsNotNeeded;
    }

    public void setLabelsNotNeeded(Boolean labelsNotNeeded) {
        this.labelsNotNeeded = labelsNotNeeded;
    }

    public Boolean getNonStockProduct() {
        return nonStockProduct;
    }

    public void setNonStockProduct(Boolean nonStockProduct) {
        this.nonStockProduct = nonStockProduct;
    }

    public Boolean getWalkInService() {
        return walkInService;
    }

    public void setWalkInService(Boolean walkInService) {
        this.walkInService = walkInService;
    }

    public Map<Integer, BigDecimal> getReorderPoint() {
        return reorderPoint;
    }

    public void setReorderPoint(Map<Integer, BigDecimal> reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public Map<Integer, BigDecimal> getRestockLevel() {
        return restockLevel;
    }

    public void setRestockLevel(Map<Integer, BigDecimal> restockLevel) {
        this.restockLevel = restockLevel;
    }

    public List<Integer> getReplacementProductIDs() {
        return replacementProductIDs;
    }

    public void setReplacementProductIDs(List<Integer> replacementProductIDs) {
        this.replacementProductIDs = replacementProductIDs;
    }

    public List<Integer> getRelatedProductIDs() {
        return relatedProductIDs;
    }

    public void setRelatedProductIDs(List<Integer> relatedProductIDs) {
        this.relatedProductIDs = relatedProductIDs;
    }

    public Integer getParentProductID() {
        return parentProductID;
    }

    public void setParentProductID(Integer parentProductID) {
        this.parentProductID = parentProductID;
    }

    public List<MatrixDimension> getDimentions() {
        return dimentions;
    }

    public void setDimentions(List<MatrixDimension> dimentions) {
        this.dimentions = dimentions;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<ProductComponent> getComponents() {
        return components;
    }

    public void setComponents(List<ProductComponent> components) {
        this.components = components;
    }
}
