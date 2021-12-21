package com.fileutility;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadFromJsonFile {
	
	public String readFromJson(String key) throws IOException, ParseException {
		FileReader fileInput = new FileReader(FilePaths.jsonFilePath);
		JSONParser json = new JSONParser();
		Object obj = json.parse(fileInput);
		HashMap<?,?> hm = (HashMap<?, ?>)obj;
		String value = hm.get(key).toString();
		return value;
	}
	
}
