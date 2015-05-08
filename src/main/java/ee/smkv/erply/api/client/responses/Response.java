package ee.smkv.erply.api.client.responses;

import ee.smkv.erply.api.client.ErplyException;
import ee.smkv.erply.api.client.StringUtils;

import java.util.List;

public abstract class Response<T> {
    private Status status;
    private List<T> records;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<T> getRecords() {
        return records;
    }

    public void setRecords(List<T> records) {
        this.records = records;
    }

    public int size() {
        return records != null ? records.size() : 0;
    }

    public T first() {
        return size() > 0 ? records.get(0) : null;
    }
    
    
    public void validate() throws ErplyException{
        if(status == null || StringUtils.isEmpty(status.getResponseStatus())){
            throw new ErplyException("Response has no status");
        }
        if("error".equals(status.getResponseStatus())){
            throw  new ErplyException( status );
            
        }
    }

    @Override
    public String toString() {
        return "Response{" +
                "status=" + status +
                ", records=" + records +
                '}';
    }
}
