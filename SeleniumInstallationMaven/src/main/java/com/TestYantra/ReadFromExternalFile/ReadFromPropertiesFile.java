package com.TestYantra.ReadFromExternalFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {
	
	public static void main(String[] args) throws IOException {
		
		String filepath= "I:\\Selenium\\1 Selenium Class\\CommonData.properties";
		
		//Reading
		FileInputStream file = new FileInputStream(filepath);
		Properties pfile = new Properties();
		pfile.load(file);
		String userName = pfile.getProperty("Username");//KEYS should be case sensitive
		String password = pfile.getProperty("Password");
		String browser  = pfile.getProperty("Browser");
		System.out.println("Username "+userName);
		System.out.println("Password "+password);
		System.out.println("Browser "+browser);
		
		//Writing			Key			Value
		pfile.setProperty("Mobile", "8760029899");
		//pfile.setProperty("Mobile","23344556"); Now the value will be replaced
		pfile.setProperty("Phone", "8760029899");
		FileOutputStream output = new FileOutputStream(filepath);
		//pfile.save(output,null); Values will be written and we have to store manually
		pfile.store(output, null); //Values will be written and Stored automatically
		//pfile.store(output,"Kiruthik"); If null replaced, comments will be on Top of the File
		
	}
}