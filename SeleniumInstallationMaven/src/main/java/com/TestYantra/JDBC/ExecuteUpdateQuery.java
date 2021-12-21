package com.TestYantra.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateQuery {
	public static void main(String[] args) throws SQLException {		
		//Step 1: Load the Driver
		Driver driverRef = new Driver();
		
		//Step 2: Register the Driver
		DriverManager.registerDriver(driverRef);
		
		//Step 3 : Establish Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		
		//Step 4 : Create Statement
		 java.sql.Statement stmt = con.createStatement();
		
		//Step 5 : Execute Statement
		ResultSet rs = stmt.executeQuery("Select * from demo");
		/*	rs.next();
		 	int num=2;	No. of rows present in table 
		  for(int i=0;i<num;i++){
		 	String name = rs.getString("name");
			rs.next();
			System.out.println(name);
			}
		 */
		
		//Step 6 : Process Response/Statement	(Optional)
		while(rs.next()) {
			String name = rs.getString("name");
			//rs.next();
			System.out.println(name);
			}
		//Step 6 : Close DB Connection
		stmt.close();
		con.close();
	}
}