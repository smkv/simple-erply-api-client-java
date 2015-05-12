package ee.smkv.erply.api.client.responses;

import java.util.Date;

public class AddCustomerRewardPointsResponse extends Response<AddCustomerRewardPointsResponse.Record> {
    public static class Record {
        private Integer transactionID;
        private Integer customerID;
        private Integer points;
        private Date createdUnixTime;
        private Date expiryUnixTime;

        public Date getCreatedUnixTime() {
            return createdUnixTime;
        }

        public void setCreatedUnixTime(Date createdUnixTime) {
            this.createdUnixTime = createdUnixTime;
        }

        public Integer getCustomerID() {
            return customerID;
        }

        public void setCustomerID(Integer customerID) {
            this.customerID = customerID;
        }

        public Date getExpiryUnixTime() {
            return expiryUnixTime;
        }

        public void setExpiryUnixTime(Date expiryUnixTime) {
            this.expiryUnixTime = expiryUnixTime;
        }

        public Integer getPoints() {
            return points;
        }

        public void setPoints(Integer points) {
            this.points = points;
        }

        public Integer getTransactionID() {
            return transactionID;
        }

        public void setTransactionID(Integer transactionID) {
            this.transactionID = transactionID;
        }
    }
}
