package com.ReadWriteFromExternalFiles;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {
	public static void main(String[] args) throws IOException, ParseException {
		String file = "I:\\Selenium\\1 Selenium Class\\TestYantra\\1 Month\\12.11.2021\\JsonFile1.json";
		FileReader inputFile = new FileReader(file);
		//JSONParser from external jar file. Creating Object for JSON
		JSONParser json = new JSONParser();
		//Parse the inputFile
		Object obj = json.parse(inputFile);
		JSONObject jobj = (JSONObject)obj; // OR // HashMap<?,?> hm = (HashMap<?, ?>)obj; 
		//Get by using get("Key value")
		String name = (String) jobj.get("name");
		long age = (long) jobj.get("age");
		boolean bool = (boolean) jobj.get("Job");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Boolean : "+bool);
	}
}