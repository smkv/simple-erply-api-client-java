package ee.smkv.erply.api.client.responses;

public class EditUsedRewardPointRecordResponse extends Response<EditUsedRewardPointRecordResponse.Record> {
    public static class Record {
        private Integer transactionID;

        public Integer getTransactionID() {
            return transactionID;
        }

        public void setTransactionID(Integer transactionID) {
            this.transactionID = transactionID;
        }
    }
}
