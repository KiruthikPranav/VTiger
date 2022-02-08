package com.ReadWriteFromExternalFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class JDBCSelectQuery {
	public static void main(String[] args) throws SQLException {
		//Register Driver
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		//Create Statement
		Statement stmt = con.createStatement();
		//Execute Queries
		ResultSet rs = stmt.executeQuery("Select * from demo;");
		ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();//Used to count column
		int totalColumn = rsmd.getColumnCount();
		System.out.println("Total number of column : " + totalColumn);
		while (rs.next()) {

			String value = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
			System.out.println(value);

		}
		//Close DB connection
		stmt.close();
		con.close();
	}
}
