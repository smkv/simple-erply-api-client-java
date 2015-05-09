package ee.smkv.erply.api.client.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.math.BigDecimal;

public class BigDecimalSerializer implements JsonDeserializer<BigDecimal> {
    @Override
    public BigDecimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String string = json.getAsString();
        return StringUtils.notEmpty(string) ? new BigDecimal(string) : null;
    }
}
