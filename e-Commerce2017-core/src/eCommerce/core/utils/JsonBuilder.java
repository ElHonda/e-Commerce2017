package eCommerce.core.utils;

import java.util.HashMap;
import java.util.Map;

public class JsonBuilder {

	private Map<String, String> jsonMap;
	private Map<String, Boolean> jsonOpt;
	
	public JsonBuilder() {
		jsonMap = new HashMap<String, String>();
		jsonOpt = new HashMap<String, Boolean>();
	}
	
	public void StringToJson(String string) {
		jsonMap.clear();
		String[] parts;
		// Faz o tratamento da string para criar objeto semelhante a json
		// Remove o primeiro e o último caracter ( Chaves {} )
		if( string != null && string.length() > 0 ) {
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
	}
	
	public void addKey( String key, String value ) {
		jsonMap.put(key, value);
		jsonOpt.put(key, false);
	}
	public void addListKey( String key, String value ) {
		// Se a chave não existe, cria um nova.
		if( jsonMap.get(key) == null ) {
			jsonMap.put(key, "[" + value + "]" );
		}else {
			// Caso a chave exista, verifica se tem conteúdo para adicionar o registro a lista
			String oldValue = jsonMap.get(key);
			if ( oldValue == null || oldValue.length() <= 0 ) {
				oldValue = value;
			}else {
				oldValue = oldValue.substring(0, oldValue.length()-1 );
				oldValue += "," + value + "]";
				jsonMap.put(key, oldValue);
			}
		}
		jsonOpt.put(key, true);
	}
	
	public String getValue(String key) {
		return jsonMap.get(key);
	}
	public Map<String,String> getJson(){
		return jsonMap;
	}
	public Map<String,Boolean> getJsonOpt(){
		return jsonOpt;
	}
	public static String JsonToString(JsonBuilder json) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : json.getJson().entrySet())
		{
			if( sb.length() > 0 )
				sb.append(",");
			sb.append("\"");
			sb.append(entry.getKey());
			if( json.getJsonOpt().get(entry.getKey()) ) {
				sb.append("\":");
				sb.append(entry.getValue());
			}else {
				sb.append("\":\"");
				sb.append(entry.getValue());
				sb.append("\"");
			}
		}
		return "{" + sb.toString() + "}";
	}
	public String JsonToString() {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : getJson().entrySet())
		{
			if( sb.length() > 0 )
				sb.append(",");
			sb.append("\"");
			sb.append(entry.getKey());
			if( jsonOpt.get(entry.getKey()) ) {
				sb.append("\":");
				sb.append(entry.getValue());
			}else {
				sb.append("\":\"");
				sb.append(entry.getValue());
				sb.append("\"");
			}
		}
		return "{" + sb.toString() + "}";
	}
}
