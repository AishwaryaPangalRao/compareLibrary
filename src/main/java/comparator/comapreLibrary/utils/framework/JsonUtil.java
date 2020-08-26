package comparator.comapreLibrary.utils.framework;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	 @SuppressWarnings("unchecked")
	    public Map<String, String> createMapFromPayload(String payload) {
	        Map<String, String> params = null;
	        try {
	            params = new ObjectMapper().readValue(payload, HashMap.class);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return params;
	    }

}
