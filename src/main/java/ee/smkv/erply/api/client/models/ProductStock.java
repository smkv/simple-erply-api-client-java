package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;
import java.util.Date;

public class ProductStock {
  private Integer productID;
  private BigDecimal amountInStock;
  private BigDecimal amountReserved;
  private BigDecimal suggestedPurchasePrice;
  private BigDecimal averagePurchasePrice;
  private BigDecimal averageCost;
  private Date firstPurchaseDate;
  private Date lastPurchaseDate;
  private Date lastSoldDate;
  private Integer reorderPoint;
  private Integer restockLevel;

  public Integer getProductID() {
    return productID;
  }

  public void setProductID(Integer productID) {
    this.productID = productID;
  }

  public BigDecimal getAmountInStock() {
    return amountInStock;
  }

  public void setAmountInStock(BigDecimal amountInStock) {
    this.amountInStock = amountInStock;
  }

  public BigDecimal getAmountReserved() {
    return amountReserved;
  }

  public void setAmountReserved(BigDecimal amountReserved) {
    this.amountReserved = amountReserved;
  }

  public BigDecimal getSuggestedPurchasePrice() {
    return suggestedPurchasePrice;
  }

  public void setSuggestedPurchasePrice(BigDecimal suggestedPurchasePrice) {
    this.suggestedPurchasePrice = suggestedPurchasePrice;
  }

  public BigDecimal getAveragePurchasePrice() {
    return averagePurchasePrice;
  }

  public void setAveragePurchasePrice(BigDecimal averagePurchasePrice) {
    this.averagePurchasePrice = averagePurchasePrice;
  }

  public BigDecimal getAverageCost() {
    return averageCost;
  }

  public void setAverageCost(BigDecimal averageCost) {
    this.averageCost = averageCost;
  }

  public Date getFirstPurchaseDate() {
    return firstPurchaseDate;
  }

  public void setFirstPurchaseDate(Date firstPurchaseDate) {
    this.firstPurchaseDate = firstPurchaseDate;
  }

  public Date getLastPurchaseDate() {
    return lastPurchaseDate;
  }

  public void setLastPurchaseDate(Date lastPurchaseDate) {
    this.lastPurchaseDate = lastPurchaseDate;
  }

  public Date getLastSoldDate() {
    return lastSoldDate;
  }

  public void setLastSoldDate(Date lastSoldDate) {
    this.lastSoldDate = lastSoldDate;
  }

  public Integer getReorderPoint() {
    return reorderPoint;
  }

  public void setReorderPoint(Integer reorderPoint) {
    this.reorderPoint = reorderPoint;
  }

  public Integer getRestockLevel() {
    return restockLevel;
  }

  public void setRestockLevel(Integer restockLevel) {
    this.restockLevel = restockLevel;
  }
}
