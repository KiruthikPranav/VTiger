package com.TestYantra.ReadFromExternalFile;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExternalFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream inputFile = new FileInputStream("I:\\Selenium\\1 Selenium Class\\xlsDemoFile.xls");
		Workbook workbook = WorkbookFactory.create(inputFile);
		String value = workbook.getSheetAt(0).getRow(3).getCell(4).getStringCellValue();
		System.out.println(value);
	}
}
