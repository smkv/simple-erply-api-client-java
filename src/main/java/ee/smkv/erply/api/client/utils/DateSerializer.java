package ee.smkv.erply.api.client.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateSerializer implements JsonDeserializer<Date> {
  private static final Pattern ISO_DATE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");

  @Override
  public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    Matcher matcher = ISO_DATE_PATTERN.matcher(json.getAsString());
    if (matcher.matches()) {
      try {
        return new SimpleDateFormat("yyyy-MM-dd").parse(json.getAsString());
      }
      catch (ParseException e) {
        throw new JsonParseException("Unable parse date: " + e.getMessage(), e);
      }
    }
    return new Date(json.getAsLong() * 1000);
  }
}
