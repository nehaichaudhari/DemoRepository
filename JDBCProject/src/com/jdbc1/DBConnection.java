package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static void main(String[] args) {
		getConnect();
	}

	static Connection conn = null;

	public static Connection getConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded...");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			System.out.println("conncetion done...");

		} catch (Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}
