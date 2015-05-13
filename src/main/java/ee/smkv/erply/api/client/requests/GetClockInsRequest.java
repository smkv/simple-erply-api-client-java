package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.ClockInsResponse;

import java.util.Date;

public class GetClockInsRequest extends Request<ClockInsResponse> {
    
    private Integer timeclockRecordID;
    private Integer employeeID;
    private Integer warehouseID;
    private Boolean notClockedOut;
    private Date inUnixTimeFrom;
    private Date inUnixTimeUntil;
    private Date outUnixTimeFrom;
    private Date outUnixTimeUntil;

    public GetClockInsRequest() {
        super("getClockIns");
    }

    @Override
    public Class<ClockInsResponse> getResponseClass() {
        return ClockInsResponse.class;
    }


    public Integer getTimeclockRecordID() {
        return timeclockRecordID;
    }

    public void setTimeclockRecordID(Integer timeclockRecordID) {
        this.timeclockRecordID = timeclockRecordID;
    }

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

    public Boolean getNotClockedOut() {
        return notClockedOut;
    }

    public void setNotClockedOut(Boolean notClockedOut) {
        this.notClockedOut = notClockedOut;
    }

    public Date getInUnixTimeFrom() {
        return inUnixTimeFrom;
    }

    public void setInUnixTimeFrom(Date inUnixTimeFrom) {
        this.inUnixTimeFrom = inUnixTimeFrom;
    }

    public Date getInUnixTimeUntil() {
        return inUnixTimeUntil;
    }

    public void setInUnixTimeUntil(Date inUnixTimeUntil) {
        this.inUnixTimeUntil = inUnixTimeUntil;
    }

    public Date getOutUnixTimeFrom() {
        return outUnixTimeFrom;
    }

    public void setOutUnixTimeFrom(Date outUnixTimeFrom) {
        this.outUnixTimeFrom = outUnixTimeFrom;
    }

    public Date getOutUnixTimeUntil() {
        return outUnixTimeUntil;
    }

    public void setOutUnixTimeUntil(Date outUnixTimeUntil) {
        this.outUnixTimeUntil = outUnixTimeUntil;
    }
}
