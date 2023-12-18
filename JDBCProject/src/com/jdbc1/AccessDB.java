package com.jdbc1;

import java.sql.Connection;

public class AccessDB {
	public static Connection con = null;

	AccessDB() {
		con = DBConnect.getConnect();
		System.out.println("--Connection Done--");
	}

	public static void main(String[] args) {

		AccessDB o1 = new AccessDB();

	}

}
