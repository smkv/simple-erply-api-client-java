package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.ClockInResponse;
import ee.smkv.erply.api.client.responses.ClockOutResponse;

import java.util.Date;

public class ClockOutRequest extends Request<ClockOutResponse> {

    private final Integer employeeID;
    private Integer pointOfSaleID;
    private Integer warehouseID;
    private final Date InUnixTime;
    private final Date OutUnixTime;

    public ClockOutRequest(Integer employeeID, Date inUnixTime, Date outUnixTime) {
        super("clockOut");
        this.employeeID = employeeID;
        InUnixTime = inUnixTime;
        OutUnixTime = outUnixTime;
    }

    @Override
    public Class<ClockOutResponse> getResponseClass() {
        return ClockOutResponse.class;
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

    public Date getOutUnixTime() {
        return OutUnixTime;
    }
}
