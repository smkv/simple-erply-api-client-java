package ee.smkv.erply.api.client.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class BooleanSerializer implements JsonDeserializer<Boolean> {

    private static final List<String> yesValues = Arrays.asList("true","y","1");

    @Override
    public Boolean deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String asString = json.getAsString();
        return asString != null && yesValues.contains(asString.trim().toLowerCase());
    }
}
