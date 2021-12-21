package com.TestYantra.ReadFromExternalFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadFromJson {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader jsonFile = new FileReader("I:\\Selenium\\1 Selenium Class\\Data.json");
		JSONParser js = new JSONParser();
		Object obj = js.parse(jsonFile);
		HashMap<?, ?> map = (HashMap<?, ?>)obj;
		String uname = map.get("Username").toString();
		String password = map.get("Password").toString();
		String browser = map.get("Browser").toString();
		System.out.println("Username is	 "+uname);
		System.out.println("Password is	 "+password);
		System.out.println("Browser is   "+browser);
	}
}
