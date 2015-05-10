package ee.smkv.erply.api.client.requests;


import ee.smkv.erply.api.client.responses.ProductUnitsResponse;

public class GetProductUnitsRequest extends Request<ProductUnitsResponse> {
    public GetProductUnitsRequest() {
        super("getProductUnits");
    }

    @Override
    public Class<ProductUnitsResponse> getResponseClass() {
        return ProductUnitsResponse.class;
    }
}
