package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductUnitsResponse;

public class GetProductUnits extends Request<ProductUnitsResponse> {
    public GetProductUnits() {
        super("getProductUnits");
    }

    @Override
    public Class<ProductUnitsResponse> getResponseClass() {
        return ProductUnitsResponse.class;
    }
}
