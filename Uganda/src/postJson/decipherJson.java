package postJson;

import javax.xml.transform.Transformer;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

public class decipherJson {
	
	public static void main(String[] args) {
		// Sample json with namespace key
		String jsonText = "{\"ns:first\": \"peanuts\", \"second\": [4, 5, 6], \"third\": 789}";

		// 1. Demonstrate parse and replace colons in namespace
		JSONParser parser = new JSONParser();
		Transformer transformer = new Transformer();
		
		try {
			parser.parse(jsonText, transformer);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Object value = transformer.getResult();
		System.out.println("Final value:\n" + value);
		
		// 2. Return the colons to the namespace form
		System.out.println(value.toString().replaceAll(COLON_REPLACEMENT, ":"));		
	}

}
