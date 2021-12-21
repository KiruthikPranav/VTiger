package com.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertyFile {

	public String propertyFile(String key) throws IOException {
	
		FileInputStream fileInput = new FileInputStream(FilePaths.propertyFilePath);//filepath is stored separatly in Interface
		Properties pfile = new Properties();
		pfile.load(fileInput);
		return pfile.getProperty(key);
	}
}
