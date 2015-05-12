package ee.smkv.erply.api.client.responses;

public class SubtractCustomerRewardPointsResponse extends Response<SubtractCustomerRewardPointsResponse.Record> {
    public static class Record {
        private Integer customerID;
        private Integer remainingPoints;
        private Integer subtractedPoints;

        public Integer getCustomerID() {
            return customerID;
        }

        public void setCustomerID(Integer customerID) {
            this.customerID = customerID;
        }

        public Integer getRemainingPoints() {
            return remainingPoints;
        }

        public void setRemainingPoints(Integer remainingPoints) {
            this.remainingPoints = remainingPoints;
        }

        public Integer getSubtractedPoints() {
            return subtractedPoints;
        }

        public void setSubtractedPoints(Integer subtractedPoints) {
            this.subtractedPoints = subtractedPoints;
        }
    }
}
