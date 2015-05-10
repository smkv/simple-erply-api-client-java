package ee.smkv.erply.api.client;

import ee.smkv.erply.api.client.models.Product;
import ee.smkv.erply.api.client.requests.GetProductsRequest;
import ee.smkv.erply.api.client.requests.VerifyUserRequest;
import ee.smkv.erply.api.client.responses.ProductsResponse;
import ee.smkv.erply.api.client.responses.VerifyUserResponse;
import org.easymock.EasyMock;
import org.junit.Test;

import java.net.URL;
import java.util.LinkedHashMap;

import static org.junit.Assert.*;


public class ErplyClientTest {

    @Test
    public void testInvoke() throws Exception {
        String clientCode = "1234";
        String username = "demo";
        String password = "password";
        EndPoint endPoint = EasyMock.createMock(EndPoint.class);
        EndPointFactory endPointFactory = EasyMock.createMock(EndPointFactory.class);
        
        EasyMock.expect(endPointFactory.createEndPoint(new URL("https://1234.erply.com/api/"))).andReturn(endPoint).times(2);

        ErplyClient client = new ErplyClient(clientCode, username, password);
        client.setEndPointFactory(endPointFactory);


        LinkedHashMap<String, String> loginParameters = new LinkedHashMap<>();
        loginParameters.put("request" ,"verifyUser");
        loginParameters.put("version" ,"1.0");
        loginParameters.put("username" ,username);
        loginParameters.put("password" ,password);
        loginParameters.put("clientCode", "1234");

        EasyMock.expect(endPoint.call(loginParameters)).andReturn("{\n" +
                "\t\"status\":{\n" +
                "\t\t\"request\":\"verifyUser\",\n" +
                "\t\t\"requestUnixTime\":1370517868,\n" +
                "\t\t\"responseStatus\":\"ok\",\n" +
                "\t\t\"errorCode\":0,\n" +
                "\t\t\"generationTime\":0.069983959197998,\n" +
                "\t\t\"recordsTotal\":1,\n" +
                "\t\t\"recordsInResponse\":1},\n" +
                "\t\"records\":[\n" +
                "\t\t{\n" +
                "\t\t\t\"userID\":\"6\",\n" +
                "\t\t\t\"userName\":\"demo\",\n" +
                "\t\t\t\"employeeID\":\"4\",\n" +
                "\t\t\t\"employeeName\":\"Clara Smith\",\n" +
                "\t\t\t\"groupID\":\"7\",\n" +
                "\t\t\t\"groupName\":\"sales representatives\",\n" +
                "\t\t\t\"sessionKey\":\"awdz94248de6f27afec27dbb2b0e1f83a5d969f594eb\",\n" +
                "\t\t\t\"sessionLength\":3600,\n" +
                "\t\t\t\"loginUrl\":\"https:\\/\\/s3.erply.com\\/eng\\/\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}");


        
        LinkedHashMap<String, String> requestParameters = new LinkedHashMap<>();
        requestParameters.put("clientCode","1234");
        requestParameters.put("request","getProducts");
        requestParameters.put("sessionKey","awdz94248de6f27afec27dbb2b0e1f83a5d969f594eb");
        requestParameters.put("productID","1");
        requestParameters.put("version", "1.0");


        EasyMock.expect(endPoint.call(requestParameters)).andReturn(
                "{" +
                        "\"status\":" +
                        "{\"request\":\"getProducts\",\"requestUnixTime\":1431262389,\"responseStatus\":\"ok\",\"errorCode\":0,\"generationTime\":0.04141092300415,\"recordsTotal\":1,\"recordsInResponse\":1}," +
                        "\"records\":[" +
                        "{\"productID\":1,\"name\":\"AKU ALC 311 650m\\/Ah Ni-Mh BLUE STAR\",\"code\":\"BS-311-650\",\"code2\":\"2000000000442\",\"code3\":\"\",\"supplierCode\":\"\",\"groupID\":51,\"price\":3.4619,\"active\":0,\"displayedInWebshop\":1,\"seriesID\":0,\"supplierID\":12,\"unitID\":1,\"vatrateID\":8,\"hasQuickSelectButton\":0,\"isGiftCard\":0,\"manufacturerName\":\"\",\"priorityGroupID\":\"1\",\"countryOfOriginID\":\"0\",\"brandID\":1,\"length\":\"0\",\"width\":\"0\",\"height\":\"0\",\"netWeight\":\"\",\"grossWeight\":\"0\",\"volume\":\"0\",\"description\":\"ALC OT310\\/ALC OT311\",\"longdesc\":\"<br \\/>\",\"descriptionENG\":\"\",\"longdescENG\":\"\",\"descriptionRUS\":\"\",\"longdescRUS\":\"\",\"descriptionFIN\":\"\",\"longdescFIN\":\"\",\"containerID\":0,\"cost\":2.05,\"added\":1267453881,\"lastModified\":1412018749,\"vatrate\":20,\"priceWithVat\":4.15,\"unitName\":\"tk\",\"brandName\":null,\"seriesName\":null,\"groupName\":null,\"supplierName\":\"Partner Telekom O\\u00dc\",\"categoryID\":0,\"categoryName\":null,\"status\":\"ARCHIVED\",\"attributes\":[{\"attributeName\":\"magentoProductID\",\"attributeType\":\"int\",\"attributeValue\":\"4195\"},{\"attributeName\":\"prestaProductID\",\"attributeType\":\"int\",\"attributeValue\":\"7096\"}],\"taxFree\":0,\"backbarCharges\":0,\"isRegularGiftCard\":0,\"nonStockProduct\":0,\"images\":[{\"pictureID\":\"346\",\"name\":\"\",\"thumbURL\":\"http:\\/\\/www.erply.net\\/files\\/3872\\/pictures\\/thumb\\/product_pict\\/wvjKtHvbZeLd.jpg\",\"smallURL\":\"http:\\/\\/www.erply.net\\/files\\/3872\\/pictures\\/web\\/product_pict\\/wvjKtHvbZeLd.jpg\",\"largeURL\":\"http:\\/\\/www.erply.net\\/files\\/3872\\/pictures\\/view\\/product_pict\\/wvjKtHvbZeLd.jpg\",\"fullURL\":\"http:\\/\\/www.erply.net\\/files\\/3872\\/pictures\\/full\\/product_pict\\/wvjKtHvbZeLd.jpg\",\"external\":0,\"hostingProvider\":\"\"}],\"type\":\"PRODUCT\",\"locationInWarehouse\":\"Mobex warehouse\"}]}");
        

        EasyMock.replay(endPointFactory, endPoint);

        GetProductsRequest request = new GetProductsRequest();
        request.setProductID(1);
        ProductsResponse response = client.invoke(request);
        Product product = response.first();
        assertEquals(new Integer(1),product.getProductID());
        
        EasyMock.verify(endPointFactory, endPoint);
    }
}