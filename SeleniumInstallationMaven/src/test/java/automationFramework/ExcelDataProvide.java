package automationFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvide {
	
	
	@Test(dataProvider="ExcelData")
	public void fetchingData(double num,double salary,String name) {
		System.out.println(num+" "+" "+salary+" "+name);
	}
	
	
	@DataProvider(name = "ExcelData")
	public Object[][] excelData() throws IOException {
		String file = "I:\\Selenium\\1 Selenium Class\\ExcelDataProvide.xls";
		FileInputStream inputFile = new FileInputStream(file);
		
		int rowNo = 0 ,cellNo=0;
		Workbook workbook = new  HSSFWorkbook(inputFile);
		Sheet sheet = workbook.getSheetAt(0);
		
		Iterator<Row> rowitr = sheet.iterator();
		Object[][] data = new Object[6][3];
		while(rowitr.hasNext()) {
			Row row = (Row) rowitr.next();
			Iterator<Cell> cellitr = row.iterator();
			cellNo=0;
			
			while(cellitr.hasNext()) {
				Cell cell = (Cell) cellitr.next();
				
				switch(cell.getCellType()) {
				case STRING:
					data[rowNo][cellNo]=cell.getStringCellValue();
					//System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					data[rowNo][cellNo]=cell.getNumericCellValue();
					//System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data[rowNo][cellNo]=cell.getBooleanCellValue();
					break;
				case _NONE:
					//data[rowNo][cellNo]=null;
					System.out.print("Null");
					break;
				case BLANK:
					break;
				case ERROR:
					break;
				case FORMULA:
					break;
				default:
					//System.out.println(" Default ");
					break;
				}
				//System.out.print(" ");
				if(cellNo==3) {
					break;
				}
				cellNo++;
			}
			rowNo++;
			//System.out.println("");
		}
		return data;
		//System.out.println(data);
		//workbook.close();
	}
}