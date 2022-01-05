package com.ReadWriteFromExternalFiles;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadArray {
	public static void main(String[] args) throws IOException, ParseException  {
		String file = "I:\\Selenium\\1 Selenium Class\\TestYantra\\1 Month\\12.11.2021\\JsonArrayFile1.json";
		FileReader inputFile = new FileReader(file);
		
		JSONParser json = new JSONParser();
		Object obj = json.parse(inputFile);
		JSONObject jobj =(JSONObject)obj;
		//HashMap<?,?> jobj = (HashMap<?, ?>)obj;
		String name = jobj.get("name").toString();
		System.out.println(name);
		long age = (long) jobj.get("age");
		System.out.println(age);
		
		JSONArray phone = (JSONArray)jobj.get("phone");
		for(int i=0;i<phone.size();i++) {
			long num = (long) phone.get(i);
			System.out.println("Mobile "+i+" : "+num);
		}
		
		JSONArray address = (JSONArray)jobj.get("address");
		for(int i=0;i<address.size();i++) {
			JSONObject jaddress = (JSONObject) address.get(i);
				String city = (String) jaddress.get("city");
				long postal = (long) jaddress.get("postal");
				System.out.println("City :"+city);
				System.out.println("Postal :"+postal);
		}
	}
}
