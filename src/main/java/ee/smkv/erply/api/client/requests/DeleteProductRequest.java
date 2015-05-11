package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.DeleteProductResponse;

public class DeleteProductRequest extends Request<DeleteProductResponse> {
  private final Integer productID;

  public DeleteProductRequest(Integer productID) {
    super("deleteProduct");
    this.productID = productID;
  }

  @Override
  public Class<DeleteProductResponse> getResponseClass() {
    return DeleteProductResponse.class;
  }
}
