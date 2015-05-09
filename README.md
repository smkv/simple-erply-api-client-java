#Simple Java client for Erply API

Usage example:
```java

import ee.smkv.erply.api.client.ErplyClient;
import ee.smkv.erply.api.client.requests.GetProductsRequest;
import ee.smkv.erply.api.client.responses.ProductsResponse;
import ee.smkv.erply.api.client.models.Product;
...

 ErplyClient client = new ErplyClient("123","demo","demopass");
 ProductsResponse response = client.invoke(new GetProductsRequest());
 for(Product product :  response.getRecords()){
  System.out.println(product.getName());
 }
```
