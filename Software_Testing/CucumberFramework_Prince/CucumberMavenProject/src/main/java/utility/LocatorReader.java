 package utility;

import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class LocatorReader {
	
	private JSONObject locators;
	
	public LocatorReader(String filePath)
	{
		JSONParser parser = new JSONParser();
		try {
			locators = (JSONObject) parser.parse(new FileReader(filePath));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}	
			
	}
	
	public String getLocatorType(String key)
	{
		JSONObject locator = (JSONObject) locators.get(key);
		return (String) locator.get("type");
		
	}
	
	public String getLocatorValue(String key)
	{
		JSONObject locator = (JSONObject) locators.get(key);
		return (String) locator.get("value");
		
	}
	
	
	

}
