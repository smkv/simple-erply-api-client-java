package ee.smkv.erply.api.client.responses;

import java.util.Date;

public class ClockOutResponse extends Response<ClockOutResponse.Record> {
    public static class Record {
        private Integer employeeID;
        private Integer pointOfSaleID;
        private Date InUnixTime;
        private Date OutUnixTime;
        private Boolean warningNotClockedInYet;
        private Boolean warningClockedOutAlready;

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

        public Date getOutUnixTime() {
            return OutUnixTime;
        }

        public void setOutUnixTime(Date outUnixTime) {
            OutUnixTime = outUnixTime;
        }

        public Boolean getWarningNotClockedInYet() {
            return warningNotClockedInYet;
        }

        public void setWarningNotClockedInYet(Boolean warningNotClockedInYet) {
            this.warningNotClockedInYet = warningNotClockedInYet;
        }

        public Boolean getWarningClockedOutAlready() {
            return warningClockedOutAlready;
        }

        public void setWarningClockedOutAlready(Boolean warningClockedOutAlready) {
            this.warningClockedOutAlready = warningClockedOutAlready;
        }
    }
}
