#Simple Java client for Erply API

Usage example:
```java
 ErplyClient client = new ErplyClient("123","demo","demo");
 ProductsResponse response = client.invoke(new GetProductsResponse());
 for(Product product :  response.getRecords()){
  System.out.println(product.getName());
 }
```
