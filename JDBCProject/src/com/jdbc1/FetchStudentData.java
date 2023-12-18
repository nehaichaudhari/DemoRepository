package com.jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchStudentData {
	static Connection con = null;
	Statement st;
	ResultSet rs;

	public FetchStudentData() {
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchStudentDetails() {
		try {
			rs = st.executeQuery("select * from student");

			System.out.println("students:---");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2) + " -- " + rs.getString(3) + " -- " + rs.getLong(4)
						+ " -- " + rs.getInt(5) + " -- " + rs.getString(6) + " -- " + rs.getFloat(7));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		FetchStudentData f1 = new FetchStudentData();
		f1.fetchStudentDetails();

	}
}
