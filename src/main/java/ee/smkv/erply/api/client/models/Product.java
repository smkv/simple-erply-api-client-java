package ee.smkv.erply.api.client.models;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Product {
    private Integer productID;
    private ProductType type;
    private Boolean active;
    private ProductStatus status;
    private String name;
    private String code;
    private String code2;
    private String code3;
    private String supplierCode;
    private Integer groupID;
    private String groupName;
    private BigDecimal price;
    private BigDecimal priceWithVat;
    private Boolean displayedInWebshop;
    private Integer categoryID;
    private String categoryName;
    private Integer supplierID;
    private String supplierNameString;
    private Integer unitID;
    private String unitName;
    private Boolean taxFree;
    private String deliveryTime;
    private Integer vatrateID;
    private BigDecimal vatrate;
    private Boolean hasQuickSelectButton;
    private Boolean isGiftCard;
    private Boolean isRegularGiftCard;
    private String manufacturerName;
    private Integer priorityGroupID;
    private Integer countryOfOriginID;
    private Integer brandID;
    private String brandName;
    private Integer width;
    private Integer height;
    private Integer length;
    private Integer lengthInMinutes;
    private Integer setupTimeInMinutes;
    private Integer cleanupTimeInMinutes;
    private Integer walkInService;
    private Integer rewardPointsNotAllowed;
    private Boolean nonStockProduct;
    private BigDecimal netWeight;
    private BigDecimal grossWeight;
    private Integer volume;
    private String description;
    private String longdesc;
    private String descriptionENG;
    private String longdescENG;
    private String descriptionRUS;
    private String longdescRUS;
    private String descriptionFIN;
    private String longdescFIN;
    private BigDecimal cost;
    private BigDecimal FIFOCost;
    private BigDecimal purchasePrice;
    private BigDecimal backbarCharges;
    private Date added;
    private Date lastModified;
    private List<Image> images;
    private List<StockInfo> warehouses;
    private List<VariationDescription> variationDescription;
    private List<Integer> productVariations;
    private List<MatrixVariation> variationList;
    private Integer parentProductID;
    private Integer containerID;
    private String containerName;
    private String containerCode;
    private String containerAmount;
    private List<Package> packages;
    private List<Integer> replacementProducts;
    private List<Integer> relatedProducts;
    private List<File> relatedFiles;
    private List<ProductComponent> productComponents;
    private BigDecimal priceListPrice;
    private BigDecimal priceListPriceWithVat;
    private String locationInWarehouse;
    private List<Attribute> attributes;
    private List<Attribute> longAttributes;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPriceWithVat() {
        return priceWithVat;
    }

    public void setPriceWithVat(BigDecimal priceWithVat) {
        this.priceWithVat = priceWithVat;
    }

    public Boolean getDisplayedInWebshop() {
        return displayedInWebshop;
    }

    public void setDisplayedInWebshop(Boolean displayedInWebshop) {
        this.displayedInWebshop = displayedInWebshop;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierNameString() {
        return supplierNameString;
    }

    public void setSupplierNameString(String supplierNameString) {
        this.supplierNameString = supplierNameString;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Boolean getTaxFree() {
        return taxFree;
    }

    public void setTaxFree(Boolean taxFree) {
        this.taxFree = taxFree;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getVatrateID() {
        return vatrateID;
    }

    public void setVatrateID(Integer vatrateID) {
        this.vatrateID = vatrateID;
    }

    public BigDecimal getVatrate() {
        return vatrate;
    }

    public void setVatrate(BigDecimal vatrate) {
        this.vatrate = vatrate;
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

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
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

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
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

    public Integer getWalkInService() {
        return walkInService;
    }

    public void setWalkInService(Integer walkInService) {
        this.walkInService = walkInService;
    }

    public Integer getRewardPointsNotAllowed() {
        return rewardPointsNotAllowed;
    }

    public void setRewardPointsNotAllowed(Integer rewardPointsNotAllowed) {
        this.rewardPointsNotAllowed = rewardPointsNotAllowed;
    }

    public Boolean getNonStockProduct() {
        return nonStockProduct;
    }

    public void setNonStockProduct(Boolean nonStockProduct) {
        this.nonStockProduct = nonStockProduct;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongdesc() {
        return longdesc;
    }

    public void setLongdesc(String longdesc) {
        this.longdesc = longdesc;
    }

    public String getDescriptionENG() {
        return descriptionENG;
    }

    public void setDescriptionENG(String descriptionENG) {
        this.descriptionENG = descriptionENG;
    }

    public String getLongdescENG() {
        return longdescENG;
    }

    public void setLongdescENG(String longdescENG) {
        this.longdescENG = longdescENG;
    }

    public String getDescriptionRUS() {
        return descriptionRUS;
    }

    public void setDescriptionRUS(String descriptionRUS) {
        this.descriptionRUS = descriptionRUS;
    }

    public String getLongdescRUS() {
        return longdescRUS;
    }

    public void setLongdescRUS(String longdescRUS) {
        this.longdescRUS = longdescRUS;
    }

    public String getDescriptionFIN() {
        return descriptionFIN;
    }

    public void setDescriptionFIN(String descriptionFIN) {
        this.descriptionFIN = descriptionFIN;
    }

    public String getLongdescFIN() {
        return longdescFIN;
    }

    public void setLongdescFIN(String longdescFIN) {
        this.longdescFIN = longdescFIN;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getFIFOCost() {
        return FIFOCost;
    }

    public void setFIFOCost(BigDecimal FIFOCost) {
        this.FIFOCost = FIFOCost;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getBackbarCharges() {
        return backbarCharges;
    }

    public void setBackbarCharges(BigDecimal backbarCharges) {
        this.backbarCharges = backbarCharges;
    }

    public Date getAdded() {
        return added;
    }

    public void setAdded(Date added) {
        this.added = added;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<StockInfo> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<StockInfo> warehouses) {
        this.warehouses = warehouses;
    }

    public List<VariationDescription> getVariationDescription() {
        return variationDescription;
    }

    public void setVariationDescription(List<VariationDescription> variationDescription) {
        this.variationDescription = variationDescription;
    }

    public List<Integer> getProductVariations() {
        return productVariations;
    }

    public void setProductVariations(List<Integer> productVariations) {
        this.productVariations = productVariations;
    }

    public List<MatrixVariation> getVariationList() {
        return variationList;
    }

    public void setVariationList(List<MatrixVariation> variationList) {
        this.variationList = variationList;
    }

    public Integer getParentProductID() {
        return parentProductID;
    }

    public void setParentProductID(Integer parentProductID) {
        this.parentProductID = parentProductID;
    }

    public Integer getContainerID() {
        return containerID;
    }

    public void setContainerID(Integer containerID) {
        this.containerID = containerID;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public String getContainerCode() {
        return containerCode;
    }

    public void setContainerCode(String containerCode) {
        this.containerCode = containerCode;
    }

    public String getContainerAmount() {
        return containerAmount;
    }

    public void setContainerAmount(String containerAmount) {
        this.containerAmount = containerAmount;
    }

    public List<Package> getPackages() {
        return packages;
    }

    public void setPackages(List<Package> packages) {
        this.packages = packages;
    }

    public List<Integer> getReplacementProducts() {
        return replacementProducts;
    }

    public void setReplacementProducts(List<Integer> replacementProducts) {
        this.replacementProducts = replacementProducts;
    }

    public List<Integer> getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(List<Integer> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public List<File> getRelatedFiles() {
        return relatedFiles;
    }

    public void setRelatedFiles(List<File> relatedFiles) {
        this.relatedFiles = relatedFiles;
    }

    public List<ProductComponent> getProductComponents() {
        return productComponents;
    }

    public void setProductComponents(List<ProductComponent> productComponents) {
        this.productComponents = productComponents;
    }

    public BigDecimal getPriceListPrice() {
        return priceListPrice;
    }

    public void setPriceListPrice(BigDecimal priceListPrice) {
        this.priceListPrice = priceListPrice;
    }

    public BigDecimal getPriceListPriceWithVat() {
        return priceListPriceWithVat;
    }

    public void setPriceListPriceWithVat(BigDecimal priceListPriceWithVat) {
        this.priceListPriceWithVat = priceListPriceWithVat;
    }

    public String getLocationInWarehouse() {
        return locationInWarehouse;
    }

    public void setLocationInWarehouse(String locationInWarehouse) {
        this.locationInWarehouse = locationInWarehouse;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Attribute> getLongAttributes() {
        return longAttributes;
    }

    public void setLongAttributes(List<Attribute> longAttributes) {
        this.longAttributes = longAttributes;
    }
}
