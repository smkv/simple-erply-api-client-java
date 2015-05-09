package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.models.ProductType;
import ee.smkv.erply.api.client.responses.ProductsResponse;

import java.util.Date;

public class GerProductsRequest  extends Request<ProductsResponse> {
    
    private Integer productID;
    private String productIDs;
    private ProductType type;
    private Boolean includeMatrixVariations;
    private Integer groupID;
    private Integer groupIDWithSubgroups;
    private String groupIDsWithSubgroups;
    private Integer categoryID;
    private Integer categoryIDWithSubcategories;
    private Integer priorityGroupID;
    private Integer supplierID;
    private Integer brandID;
    private Integer unitID;
    private Integer vatrateID;
    private Integer parentProductID;
    private String code;
    private String code2;
    private String code3;
    private String supplierCode;
    private String name;
    private String codePrefix;
    private String code2Prefix;
    private String code3Prefix;
    private String supplierCodePrefix;
    private String namePrefix;
    private Boolean searchCodeFromMiddle;
    private String searchName;
    private String searchNameIncrementally;
    private Boolean findBestMatch;
    private Boolean active;
    private Boolean nonStockProduct;
    private Boolean quickPosProducts;
    private Boolean giftCards;
    private Boolean displayedInWebshop;
    private Boolean getStockInfo;
    private Boolean getFIFOCost;
    private Boolean getContainerInfo;
    private Boolean getPackageInfo;
    private Boolean getReplacementProducts;
    private Boolean getRelatedProducts;
    private Boolean getMatrixVariations;
    private Boolean getRelatedFiles;
    private Boolean getRecipes;
    private Boolean getParameters;
    private Boolean getPriceListPrices;
    private Boolean getItemsFromFirstPriceListOnly;
    private Boolean getWarehouseSpecificVAT;
    private Boolean getOnlyItemsInStock;
    private Integer warehouseID;
    private Integer clientID;
    private String searchAttributeName;
    private String searchAttributeValue;
    private Integer searchParameterOptionID;
    private Integer searchParameterID;
    private String searchParameterValue;
    private Date addedSince;
    private Date changedSince;
    private String lang;
    private Boolean getAllLanguages;
    private String orderBy;
    private OrderByDirection orderByDir;
    private Integer recordsOnPage;
    private Integer pageNo;
    private Integer recordOffset;


    
    public GerProductsRequest() {
        super("getProducts");
    }

    @Override
    public Class<ProductsResponse> getResponseClass() {
        return ProductsResponse.class;
    }


    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductIDs() {
        return productIDs;
    }

    public void setProductIDs(String productIDs) {
        this.productIDs = productIDs;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public Boolean getIncludeMatrixVariations() {
        return includeMatrixVariations;
    }

    public void setIncludeMatrixVariations(Boolean includeMatrixVariations) {
        this.includeMatrixVariations = includeMatrixVariations;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public Integer getGroupIDWithSubgroups() {
        return groupIDWithSubgroups;
    }

    public void setGroupIDWithSubgroups(Integer groupIDWithSubgroups) {
        this.groupIDWithSubgroups = groupIDWithSubgroups;
    }

    public String getGroupIDsWithSubgroups() {
        return groupIDsWithSubgroups;
    }

    public void setGroupIDsWithSubgroups(String groupIDsWithSubgroups) {
        this.groupIDsWithSubgroups = groupIDsWithSubgroups;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getCategoryIDWithSubcategories() {
        return categoryIDWithSubcategories;
    }

    public void setCategoryIDWithSubcategories(Integer categoryIDWithSubcategories) {
        this.categoryIDWithSubcategories = categoryIDWithSubcategories;
    }

    public Integer getPriorityGroupID() {
        return priorityGroupID;
    }

    public void setPriorityGroupID(Integer priorityGroupID) {
        this.priorityGroupID = priorityGroupID;
    }

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public Integer getVatrateID() {
        return vatrateID;
    }

    public void setVatrateID(Integer vatrateID) {
        this.vatrateID = vatrateID;
    }

    public Integer getParentProductID() {
        return parentProductID;
    }

    public void setParentProductID(Integer parentProductID) {
        this.parentProductID = parentProductID;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodePrefix() {
        return codePrefix;
    }

    public void setCodePrefix(String codePrefix) {
        this.codePrefix = codePrefix;
    }

    public String getCode2Prefix() {
        return code2Prefix;
    }

    public void setCode2Prefix(String code2Prefix) {
        this.code2Prefix = code2Prefix;
    }

    public String getCode3Prefix() {
        return code3Prefix;
    }

    public void setCode3Prefix(String code3Prefix) {
        this.code3Prefix = code3Prefix;
    }

    public String getSupplierCodePrefix() {
        return supplierCodePrefix;
    }

    public void setSupplierCodePrefix(String supplierCodePrefix) {
        this.supplierCodePrefix = supplierCodePrefix;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public Boolean getSearchCodeFromMiddle() {
        return searchCodeFromMiddle;
    }

    public void setSearchCodeFromMiddle(Boolean searchCodeFromMiddle) {
        this.searchCodeFromMiddle = searchCodeFromMiddle;
    }

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }

    public String getSearchNameIncrementally() {
        return searchNameIncrementally;
    }

    public void setSearchNameIncrementally(String searchNameIncrementally) {
        this.searchNameIncrementally = searchNameIncrementally;
    }

    public Boolean getFindBestMatch() {
        return findBestMatch;
    }

    public void setFindBestMatch(Boolean findBestMatch) {
        this.findBestMatch = findBestMatch;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getNonStockProduct() {
        return nonStockProduct;
    }

    public void setNonStockProduct(Boolean nonStockProduct) {
        this.nonStockProduct = nonStockProduct;
    }

    public Boolean getQuickPosProducts() {
        return quickPosProducts;
    }

    public void setQuickPosProducts(Boolean quickPosProducts) {
        this.quickPosProducts = quickPosProducts;
    }

    public Boolean getGiftCards() {
        return giftCards;
    }

    public void setGiftCards(Boolean giftCards) {
        this.giftCards = giftCards;
    }

    public Boolean getDisplayedInWebshop() {
        return displayedInWebshop;
    }

    public void setDisplayedInWebshop(Boolean displayedInWebshop) {
        this.displayedInWebshop = displayedInWebshop;
    }

    public Boolean getGetStockInfo() {
        return getStockInfo;
    }

    public void setGetStockInfo(Boolean getStockInfo) {
        this.getStockInfo = getStockInfo;
    }

    public Boolean getGetFIFOCost() {
        return getFIFOCost;
    }

    public void setGetFIFOCost(Boolean getFIFOCost) {
        this.getFIFOCost = getFIFOCost;
    }

    public Boolean getGetContainerInfo() {
        return getContainerInfo;
    }

    public void setGetContainerInfo(Boolean getContainerInfo) {
        this.getContainerInfo = getContainerInfo;
    }

    public Boolean getGetPackageInfo() {
        return getPackageInfo;
    }

    public void setGetPackageInfo(Boolean getPackageInfo) {
        this.getPackageInfo = getPackageInfo;
    }

    public Boolean getGetReplacementProducts() {
        return getReplacementProducts;
    }

    public void setGetReplacementProducts(Boolean getReplacementProducts) {
        this.getReplacementProducts = getReplacementProducts;
    }

    public Boolean getGetRelatedProducts() {
        return getRelatedProducts;
    }

    public void setGetRelatedProducts(Boolean getRelatedProducts) {
        this.getRelatedProducts = getRelatedProducts;
    }

    public Boolean getGetMatrixVariations() {
        return getMatrixVariations;
    }

    public void setGetMatrixVariations(Boolean getMatrixVariations) {
        this.getMatrixVariations = getMatrixVariations;
    }

    public Boolean getGetRelatedFiles() {
        return getRelatedFiles;
    }

    public void setGetRelatedFiles(Boolean getRelatedFiles) {
        this.getRelatedFiles = getRelatedFiles;
    }

    public Boolean getGetRecipes() {
        return getRecipes;
    }

    public void setGetRecipes(Boolean getRecipes) {
        this.getRecipes = getRecipes;
    }

    public Boolean getGetParameters() {
        return getParameters;
    }

    public void setGetParameters(Boolean getParameters) {
        this.getParameters = getParameters;
    }

    public Boolean getGetPriceListPrices() {
        return getPriceListPrices;
    }

    public void setGetPriceListPrices(Boolean getPriceListPrices) {
        this.getPriceListPrices = getPriceListPrices;
    }

    public Boolean getGetItemsFromFirstPriceListOnly() {
        return getItemsFromFirstPriceListOnly;
    }

    public void setGetItemsFromFirstPriceListOnly(Boolean getItemsFromFirstPriceListOnly) {
        this.getItemsFromFirstPriceListOnly = getItemsFromFirstPriceListOnly;
    }

    public Boolean getGetWarehouseSpecificVAT() {
        return getWarehouseSpecificVAT;
    }

    public void setGetWarehouseSpecificVAT(Boolean getWarehouseSpecificVAT) {
        this.getWarehouseSpecificVAT = getWarehouseSpecificVAT;
    }

    public Boolean getGetOnlyItemsInStock() {
        return getOnlyItemsInStock;
    }

    public void setGetOnlyItemsInStock(Boolean getOnlyItemsInStock) {
        this.getOnlyItemsInStock = getOnlyItemsInStock;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
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

    public Integer getSearchParameterOptionID() {
        return searchParameterOptionID;
    }

    public void setSearchParameterOptionID(Integer searchParameterOptionID) {
        this.searchParameterOptionID = searchParameterOptionID;
    }

    public Integer getSearchParameterID() {
        return searchParameterID;
    }

    public void setSearchParameterID(Integer searchParameterID) {
        this.searchParameterID = searchParameterID;
    }

    public String getSearchParameterValue() {
        return searchParameterValue;
    }

    public void setSearchParameterValue(String searchParameterValue) {
        this.searchParameterValue = searchParameterValue;
    }

    public Date getAddedSince() {
        return addedSince;
    }

    public void setAddedSince(Date addedSince) {
        this.addedSince = addedSince;
    }

    public Date getChangedSince() {
        return changedSince;
    }

    public void setChangedSince(Date changedSince) {
        this.changedSince = changedSince;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getGetAllLanguages() {
        return getAllLanguages;
    }

    public void setGetAllLanguages(Boolean getAllLanguages) {
        this.getAllLanguages = getAllLanguages;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public OrderByDirection getOrderByDir() {
        return orderByDir;
    }

    public void setOrderByDir(OrderByDirection orderByDir) {
        this.orderByDir = orderByDir;
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

    public Integer getRecordOffset() {
        return recordOffset;
    }

    public void setRecordOffset(Integer recordOffset) {
        this.recordOffset = recordOffset;
    }
}
