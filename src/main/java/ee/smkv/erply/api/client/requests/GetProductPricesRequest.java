package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductPricesResponse;

import java.util.List;

public class GetProductPricesRequest extends Request<ProductPricesResponse>{
    
    private Integer productID;
    private List<Integer> productIDs;
    private Integer clientID;
    private Integer warehouseID;

    protected GetProductPricesRequest() {
        super("getProductPrices");
    }

    @Override
    public Class<ProductPricesResponse> getResponseClass() {
        return ProductPricesResponse.class;
    }


    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public List<Integer> getProductIDs() {
        return productIDs;
    }

    public void setProductIDs(List<Integer> productIDs) {
        this.productIDs = productIDs;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Integer getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Integer warehouseID) {
        this.warehouseID = warehouseID;
    }
}
