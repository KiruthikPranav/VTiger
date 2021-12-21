package com.fileutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.mysql.cj.jdbc.Driver;

public class DataBaseSelectQuery {
	
	Connection con;
	
	//Connect to DataBase
	public void connectToDataBase() throws SQLException {
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		con = DriverManager.getConnection(DataBasePath.connectionUrl,DataBasePath.user,DataBasePath.password);
	}
	
	//Process the Value
	//ExecuteValue
	public ArrayList<String> executeValue(String query, int columnIndex) throws SQLException {
		ArrayList<String> value=new ArrayList<String>();
		String val;
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			val = rs.getString(columnIndex);
			value.add(val);
		}
		return value;
	}
	
	//Validate given query
	public void validateValue(String query, int columnIndex,String expectedValue) throws SQLException {
		boolean flag = false;
		String actualValue=null;
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(query);
		while(rs.next()) {
			actualValue = rs.getString(columnIndex);
			if(expectedValue.equalsIgnoreCase(actualValue)) {
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println("Valid User");
		else
			System.out.println("InValid User");
	}
	
	//Close the DataBaseConnection
	public void closeDataBase() throws SQLException {
		con.close();
		System.out.println("Database is closed");
	}
}