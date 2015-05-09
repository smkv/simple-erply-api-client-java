package ee.smkv.erply.api.client.models;

import java.math.BigDecimal;

public class StockInfo {
    private Integer warehouseID;
    private Integer totalInStock;
    private Integer reserved;
    private Integer free;
    private Integer orderPending;
    private Integer reorderPoint;
    private Integer restockLevel;
    private Integer purchasePrice;
    private BigDecimal FIFOCost;


    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Integer getTotalInStock() {
        return totalInStock;
    }

    public void setTotalInStock(Integer totalInStock) {
        this.totalInStock = totalInStock;
    }

    public Integer getReserved() {
        return reserved;
    }

    public void setReserved(Integer reserved) {
        this.reserved = reserved;
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getOrderPending() {
        return orderPending;
    }

    public void setOrderPending(Integer orderPending) {
        this.orderPending = orderPending;
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

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public BigDecimal getFIFOCost() {
        return FIFOCost;
    }

    public void setFIFOCost(BigDecimal FIFOCost) {
        this.FIFOCost = FIFOCost;
    }
}
