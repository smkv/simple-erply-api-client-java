package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.models.ProductStatus;
import ee.smkv.erply.api.client.responses.ProductStockResponse;

import java.util.Date;
import java.util.List;

public class GetProductStockRequest extends Request<ProductStockResponse> {

  private final Integer warehouseID;
  private Integer productID;
  private List<Integer> productIDs;
  private Integer groupID;
  private Integer groupIDWithSubgroups;
  private Integer supplierID;
  private Integer brandID;
  private Integer priorityGroupID;
  private Integer categoryID;
  private Integer categoryIDWithSubcategories;
  private Integer parentProductID;
  private ProductStatus status;
  private Boolean getReorderPoints;
  private Boolean getAmountReserved;
  private Boolean getSuggestedPurchasePrice;
  private Boolean getAveragePrices;

  private Boolean getFirstPurchase;

  private Date getFirstPurchaseDate;

  private Boolean getLastPurchase;

  private Date getLastPurchaseDate;

  private Boolean getLastSold;

  private Date getLastSoldDate;
  private Boolean getProductsWithReorderPointDefined;
  private Boolean getProductsWithRestockLevelDefined;
  private Date changedSince;


  public GetProductStockRequest(Integer warehouseID) {
    super("getProductStock");
    this.warehouseID = warehouseID;
  }

  @Override
  public Class<ProductStockResponse> getResponseClass() {
    return ProductStockResponse.class;
  }

  public Integer getWarehouseID() {
    return warehouseID;
  }

  public Integer getProductID() {
    return productID;
  }

  public void setProductID(Integer productID) {
    this.productID = productID;
  }

  public List<Integer> getProductIDs() {
    return productIDs;
  }

  public void setProductIDs(List<Integer> productIDs) {
    this.productIDs = productIDs;
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

  public Integer getPriorityGroupID() {
    return priorityGroupID;
  }

  public void setPriorityGroupID(Integer priorityGroupID) {
    this.priorityGroupID = priorityGroupID;
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

  public Integer getParentProductID() {
    return parentProductID;
  }

  public void setParentProductID(Integer parentProductID) {
    this.parentProductID = parentProductID;
  }

  public ProductStatus getStatus() {
    return status;
  }

  public void setStatus(ProductStatus status) {
    this.status = status;
  }

  public Boolean getGetReorderPoints() {
    return getReorderPoints;
  }

  public void setGetReorderPoints(Boolean getReorderPoints) {
    this.getReorderPoints = getReorderPoints;
  }

  public Boolean getGetAmountReserved() {
    return getAmountReserved;
  }

  public void setGetAmountReserved(Boolean getAmountReserved) {
    this.getAmountReserved = getAmountReserved;
  }

  public Boolean getGetSuggestedPurchasePrice() {
    return getSuggestedPurchasePrice;
  }

  public void setGetSuggestedPurchasePrice(Boolean getSuggestedPurchasePrice) {
    this.getSuggestedPurchasePrice = getSuggestedPurchasePrice;
  }

  public Boolean getGetAveragePrices() {
    return getAveragePrices;
  }

  public void setGetAveragePrices(Boolean getAveragePrices) {
    this.getAveragePrices = getAveragePrices;
  }

  @Parameter("getFirstPurchaseDate")
  public Boolean getGetFirstPurchase() {
    return getFirstPurchase;
  }

  public void setGetFirstPurchase(Boolean getFirstPurchase) {
    this.getFirstPurchase = getFirstPurchase;
  }

  @Parameter(value = "getFirstPurchaseDate", format = ISO_DATE_FORMAT)
  public Date getGetFirstPurchaseDate() {
    return getFirstPurchaseDate;
  }

  public void setGetFirstPurchaseDate(Date getFirstPurchaseDate) {
    this.getFirstPurchaseDate = getFirstPurchaseDate;
  }

  @Parameter("getLastPurchaseDate")
  public Boolean getGetLastPurchase() {
    return getLastPurchase;
  }

  public void setGetLastPurchase(Boolean getLastPurchase) {
    this.getLastPurchase = getLastPurchase;
  }

  @Parameter(value = "getLastPurchaseDate", format = ISO_DATE_FORMAT)
  public Date getGetLastPurchaseDate() {
    return getLastPurchaseDate;
  }

  public void setGetLastPurchaseDate(Date getLastPurchaseDate) {
    this.getLastPurchaseDate = getLastPurchaseDate;
  }

  @Parameter("getLastSoldDate")
  public Boolean getGetLastSold() {
    return getLastSold;
  }

  public void setGetLastSold(Boolean getLastSold) {
    this.getLastSold = getLastSold;
  }

  @Parameter(value = "getLastSoldDate", format = ISO_DATE_FORMAT)
  public Date getGetLastSoldDate() {
    return getLastSoldDate;
  }

  public void setGetLastSoldDate(Date getLastSoldDate) {
    this.getLastSoldDate = getLastSoldDate;
  }

  public Boolean getGetProductsWithReorderPointDefined() {
    return getProductsWithReorderPointDefined;
  }

  public void setGetProductsWithReorderPointDefined(Boolean getProductsWithReorderPointDefined) {
    this.getProductsWithReorderPointDefined = getProductsWithReorderPointDefined;
  }

  public Boolean getGetProductsWithRestockLevelDefined() {
    return getProductsWithRestockLevelDefined;
  }

  public void setGetProductsWithRestockLevelDefined(Boolean getProductsWithRestockLevelDefined) {
    this.getProductsWithRestockLevelDefined = getProductsWithRestockLevelDefined;
  }

  public Date getChangedSince() {
    return changedSince;
  }

  public void setChangedSince(Date changedSince) {
    this.changedSince = changedSince;
  }
}
