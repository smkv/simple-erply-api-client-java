package ee.smkv.erply.api.client.responses;

import java.util.Date;

public class ClockInResponse extends Response<ClockInResponse.Record> {
    public static class Record {
        private Integer employeeID;
        private Integer pointOfSaleID;
        private Date InUnixTime;
        private Boolean warningAlreadyClockedIn;

        public Integer getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(Integer employeeID) {
            this.employeeID = employeeID;
        }

        public Integer getPointOfSaleID() {
            return pointOfSaleID;
        }

        public void setPointOfSaleID(Integer pointOfSaleID) {
            this.pointOfSaleID = pointOfSaleID;
        }

        public Date getInUnixTime() {
            return InUnixTime;
        }

        public void setInUnixTime(Date inUnixTime) {
            InUnixTime = inUnixTime;
        }

        public Boolean getWarningAlreadyClockedIn() {
            return warningAlreadyClockedIn;
        }

        public void setWarningAlreadyClockedIn(Boolean warningAlreadyClockedIn) {
            this.warningAlreadyClockedIn = warningAlreadyClockedIn;
        }
    }
}
