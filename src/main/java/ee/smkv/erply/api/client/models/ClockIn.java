package ee.smkv.erply.api.client.models;

import java.util.Date;

public class ClockIn {
    private Integer employeeID;
    private Integer warehouseID;
    private Date InUnixTime;
    private Date OutUnixTime;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
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

    public void setInUnixTime(Date inUnixTime) {
        InUnixTime = inUnixTime;
    }

    public Date getOutUnixTime() {
        return OutUnixTime;
    }

    public void setOutUnixTime(Date outUnixTime) {
        OutUnixTime = outUnixTime;
    }
}
