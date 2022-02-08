package com.ReadWriteFromExternalFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class JDBCNonSelectQuery {
	public static void main(String[] args) throws SQLException {
		
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate("insert into demo values(3,'Karthi',54)");
		System.out.println(count+" rows got affected");	
		
	}
}