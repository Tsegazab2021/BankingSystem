
package com.bank.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBconection {


	public static Connection getConnection() throws SQLException {
		

	Connection myConn = null;
	try {
		
	
	String URL = "jdbc:mysql://localhost:3306/bank_db";
	String USER = "root";
	String PASSWORD = "Root";
	myConn = DriverManager.getConnection(URL, USER, PASSWORD);
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	return myConn;
}
}