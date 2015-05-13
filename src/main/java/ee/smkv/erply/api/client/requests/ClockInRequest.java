package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.ClockInResponse;

import java.util.Date;

public class ClockInRequest extends Request<ClockInResponse> {
    
    private final Integer employeeID;
    private Integer pointOfSaleID;
    private Integer warehouseID;
    private final Date InUnixTime;

    public ClockInRequest(Integer employeeID, Date inUnixTime) {
        super("clockIn");
        this.employeeID = employeeID;
        InUnixTime = inUnixTime;
    }

    @Override
    public Class<ClockInResponse> getResponseClass() {
        return ClockInResponse.class;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public Integer getPointOfSaleID() {
        return pointOfSaleID;
    }

    public void setPointOfSaleID(Integer pointOfSaleID) {
        this.pointOfSaleID = pointOfSaleID;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }

    public Date getInUnixTime() {
        return InUnixTime;
    }
}
