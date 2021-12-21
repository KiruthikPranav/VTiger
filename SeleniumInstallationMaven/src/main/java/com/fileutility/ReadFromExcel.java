package com.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public String fetchFile(int sheet,int row,int cell) throws EncryptedDocumentException, IOException{
		FileInputStream fileInput = new FileInputStream(FilePaths.excelFilePath);
		Workbook workbook = WorkbookFactory.create(fileInput);
		String value = workbook.getSheetAt(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;	
	}
		
}