package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static void main(String[] args) {
		getConnect();
	}

	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/studentdb";
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "root";
	static Connection conn = null;

	public static Connection getConnect() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded...");
			conn = DriverManager.getConnection(JDBC_URL, USER_NAME, PASSWORD);
			//System.out.println("conncetion done...");

		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}
