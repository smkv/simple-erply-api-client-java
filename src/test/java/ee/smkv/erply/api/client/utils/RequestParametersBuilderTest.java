package ee.smkv.erply.api.client.utils;

import ee.smkv.erply.api.client.requests.Request;
import ee.smkv.erply.api.client.responses.Response;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.junit.Assert.*;


public class RequestParametersBuilderTest {

    @Test
    public void testBuild() throws Exception {
        Map<String, String> expected = new LinkedHashMap<String, String>();
        expected.put("version", "1.0");
        expected.put("request", "test");

        Map<String, String> actual = new RequestParametersBuilder(new TestRequest("test")).build();
        for(String key : expected.keySet()){
            assertEquals( expected.get(key) ,actual.get(key));
        }
    }


    @Test
    public void testBuildNestedFields() throws Exception {
        final Date date = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").parse("10.05.2015 18:50:00");
        
        Map<String, String> expected = new LinkedHashMap<String, String>();
        expected.put("version", "1.0");
        expected.put("request", "test");
        expected.put("id", "1");
        expected.put("name", "test-name");
        expected.put("price", "10.55");
        expected.put("active", "1");
        expected.put("created", String.valueOf(date.getTime() / 1000));
        expected.put("empty", "");

        Map<String, String> actual = new RequestParametersBuilder(new TestRequest("test") {
            Integer id = 1;
            String name = "test-name";
            BigDecimal price = new BigDecimal("10.55");
            Boolean active = true;
            Date created = date;
            String aNull;
            String empty = "";

            public Boolean getActive() {
                return active;
            }

            public String getaNull() {
                return aNull;
            }

            public Date getCreated() {
                return created;
            }

            public String getEmpty() {
                return empty;
            }

            public Integer getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public BigDecimal getPrice() {
                return price;
            }
        }).build();
        for(String key : expected.keySet()){
            assertEquals( expected.get(key) ,actual.get(key));
        }
    }


    @Test
    public void testBuildSimpleList() throws Exception {
        Map<String, String> expected = new LinkedHashMap<String, String>();
        expected.put("version", "1.0");
        expected.put("request", "test");
        expected.put("ids", "1,2,3");
        expected.put("strings", "a,b,c");

        Map<String, String> actual = new RequestParametersBuilder(new TestRequest("test"){
            List<Integer> ids = Arrays.asList(1,2,3);
            List<String> strings = Arrays.asList("a","b","c");
            List<String> empty = Arrays.asList();

            public List<Integer> getIds() {
                return ids;
            }

            public List<String> getStrings() {
                return strings;
            }

            public List<String> getEmpty() {
                return empty;
            }
        }).build();
        for(String key : expected.keySet()){
            assertEquals( expected.get(key) ,actual.get(key));
        }
    }


    @Test
    public void testBuildExtendedList() throws Exception {
        Map<String, String> expected = new LinkedHashMap<String, String>();
        expected.put("version", "1.0");
        expected.put("request", "test");
        expected.put("id1", "1");
        expected.put("name1", "a");
        expected.put("id2", "2");
        expected.put("name2", "b");


        Map<String, String> actual = new RequestParametersBuilder(new TestRequest("test"){
            List<TestObject> list = Arrays.asList( new TestObject(1,"a"), new TestObject(2,"b"));

            public List<TestObject> getList() {
                return list;
            }
        }).build();
        
        for(String key : expected.keySet()){
            assertEquals( expected.get(key) ,actual.get(key));
        }
    }

    private class TestObject{
        private Integer id;
        private String name;

        public TestObject(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }

    private class TestRequest extends Request<TestResponse> {

        protected TestRequest(String request) {
            super(request);
        }

        @Override
        public Class<TestResponse> getResponseClass() {
            return TestResponse.class;
        }
    }

    private class TestResponse extends Response {
    }
}