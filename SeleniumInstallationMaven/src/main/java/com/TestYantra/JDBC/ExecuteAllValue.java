package com.TestYantra.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class ExecuteAllValue {
	public static void main(String[] args) throws SQLException {
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from demo;");
		ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		int totalColumn = rsmd.getColumnCount();
		System.out.println("Total number of column : " + totalColumn);
		while (rs.next()) {

			String value = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
			System.out.println(value);

		}
		stmt.close();
		con.close();
	}
}