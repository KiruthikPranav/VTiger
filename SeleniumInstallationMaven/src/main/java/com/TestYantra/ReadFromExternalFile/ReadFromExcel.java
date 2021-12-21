package com.TestYantra.ReadFromExternalFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class ReadFromExcel {	
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("I:\\Selenium\\1 Selenium Class\\xlsDemoFile.xls");
		Workbook workbook = new HSSFWorkbook(fileInput);
		Sheet sheet = (HSSFSheet)workbook.getSheetAt(0);
		int name = (int) sheet.getRow(1).getCell(5).getNumericCellValue();
		System.out.println(name);
		workbook.close();
	}
}
