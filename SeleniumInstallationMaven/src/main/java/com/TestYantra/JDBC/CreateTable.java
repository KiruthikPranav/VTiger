package com.TestYantra.JDBC;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;

public class CreateTable {
	public static void main(String[] args) throws SQLException {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter table name");
		String tableName = S.next();
		String query= "CREATE TABLE "+ tableName +"(ORGNO INT NOT NULL, SAL INT NOT NULL)";
		Driver d = new Driver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
		DatabaseMetaData dbm = con.getMetaData();
		ResultSet rs = dbm.getTables(null, null, tableName, null);
		Statement stmt = null;
		if(rs.next()) {
			System.out.println("Table Already Exists");
		}
		else {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table created");
			stmt.close();
		}
		stmt.close();
		con.close();
		S.close();
	}
}