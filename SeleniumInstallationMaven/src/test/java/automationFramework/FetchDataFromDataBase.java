package automationFramework;

import java.sql.SQLException;
import java.util.ArrayList;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fileutility.DataBaseSelectQuery;


public class FetchDataFromDataBase {
	DataBaseSelectQuery db = new DataBaseSelectQuery();
	
	@BeforeTest
	public void connection() throws SQLException {
		db.connectToDataBase();		//Connecting to DataBase
	}
	
	@Test
	public void printAllColumnValue() throws SQLException  {
		//Execute Value
		String query = "Select * from demo";
		int columnIndex = 1;
		ArrayList<String> value = new ArrayList<String>();
		value.addAll(db.executeValue(query, columnIndex));
		java.util.Iterator<String> itr = value.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	@Test
	public void verifyValue() throws SQLException {
		String query = "Select * from demo";
		int columnIndex = 2;
		String expectedValue = "kiruthik";
		db.validateValue(query, columnIndex, expectedValue);
	}
	
	@AfterTest
	public void closeDbConnection() throws SQLException {
		db.closeDataBase();		//Close the DataBaseConnection
	}
	
}