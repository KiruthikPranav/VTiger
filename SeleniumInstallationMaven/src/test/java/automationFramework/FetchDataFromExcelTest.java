package automationFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.fileutility.ReadFromExcel;

public class FetchDataFromExcelTest {
	@Test
	public void fetchData() throws EncryptedDocumentException, IOException {
		ReadFromExcel re = new ReadFromExcel();
		int sheet = 0;
		int row = 2;
		int cell = 3;
		String value = re.fetchFile(sheet, row, cell);
		System.out.println(value);
	}
}
