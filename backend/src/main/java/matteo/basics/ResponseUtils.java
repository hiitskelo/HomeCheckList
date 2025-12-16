package matteo.basics;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class ResponseUtils {
    private static final ObjectMapper mapper = new ObjectMapper()
            .findAndRegisterModules() // supports Java time, etc.
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

    /** Convert any object to JSON string */
    public static String toJson(Object object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Failed to convert object to JSON", e);
        }
    }

    /** Convert JSON string to object */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return mapper.readValue(json, clazz);
        } catch (Exception e) {
            throw new RuntimeException("Failed to convert JSON to object", e);
        }
    }
}
