package com.ReadWriteFromExternalFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReadWrite {
	public static void main(String[] args) throws IOException {
		String filePath ="I:\\Selenium\\Selenium Workspace\\SeleniumInstallationMaven\\src\\main\\resources\\ExternalFileData\\Property.Properties";
		
		/**
		 * FileInputStream read data into the byte format
		 */
		FileInputStream inputFile = new FileInputStream(filePath);
		/**
		 *  Property file is light weight & faster to read the data compare to any other file, 
		 *  & java as own libraries to read the data
		 */
		Properties pfile = new Properties();
		pfile.load(inputFile);	//load the file
		String name = pfile.getProperty("username");	//getProperty is used to get Value from file
		System.out.println(name);
		
		/**
		 * Write into Property File
		 */
		String key = "Mobile";
		String value = "Iphone";
		/**
		    String key = "Mobile";
			String value = "Samsung"; if we try change value for same key, old will replaced to new Value
		 */
		pfile.setProperty(key, value);
		FileOutputStream outputFile = new FileOutputStream(filePath);
		//pfile.save(outputFile, null);
		pfile.store(outputFile, null);
		System.out.println("File Written");
	}
}
