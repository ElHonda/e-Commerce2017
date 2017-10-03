package eCommerce.core.utils;

import java.util.HashMap;
import java.util.Map;

public class JsonBuilder {

	private Map<String, String> jsonMap;
	
	public JsonBuilder() {
		jsonMap = new HashMap<String, String>();
	}
	
	public void StringToJson(String string) {
		jsonMap.clear();
		String[] parts;
		// Faz o tratamento da string para criar objeto semelhante a json
		// Remove o primeiro e o último caracter ( Chaves {} )
		string = string.substring(1, string.length()-1);
		parts = string.split(",");
		
		for( String s : parts ) {
			String[] duo = s.split(":");
			String str1 = duo[0].trim();
			String str2 = duo[1].trim();
			str1 = str1.substring(1);
			str1 = str1.substring(0, str1.length()-1);
			str2 = str2.substring(1);
			str2 = str2.substring(0, str2.length()-1);

			jsonMap.put(str1,str2);
		}
	}
	
	public void addKey( String key, String value ) {
		jsonMap.put(key, value);
	}
	
	public String getValue(String key) {
		return jsonMap.get(key);
	}
	public Map<String,String> getJson(){
		return jsonMap;
	}
	public static String JsonToString(JsonBuilder json) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : json.getJson().entrySet())
		{
			if( sb.length() > 0 )
				sb.append(",");
			sb.append("\"");
			sb.append(entry.getKey());
			sb.append("\":\"");
			sb.append(entry.getValue());
			sb.append("\"");
		}
		return "{" + sb.toString() + "}";
	}
}
