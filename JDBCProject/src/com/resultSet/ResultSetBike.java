package com.resultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc2.DBConnect;

public class ResultSetBike {
	static Scanner sc = new Scanner(System.in);
	Statement stmt;
	ResultSet rs;
	Connection conn = null;

	public ResultSetBike() {
		conn = DBConnect.getConnect();
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select * from model");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fetchModelDetails() {
		try {
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println("Model id: " + rs.getInt(1) + "  Model name: " + rs.getString(2) + "  Model cost: "
						+ rs.getInt(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fetchModelDetailsReverse() {
		try {
			rs.afterLast();
			while (rs.previous()) {
				System.out.println("Model id: " + rs.getInt(1) + "  Model name: " + rs.getString(2) + "  Model cost: "
						+ rs.getInt(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertModel() {
		try {
			rs.moveToInsertRow();

			System.out.println("Enter the model id: ");
			int mId = sc.nextInt();

			System.out.println("Enter the model name: ");
			String mName = sc.next();

			System.out.println("Enter the cost: ");
			int cost = sc.nextInt();

			rs.updateInt(1, mId);
			rs.updateString(2, mName);
			rs.updateInt(3, cost);

			rs.insertRow();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteModel() {
		System.out.println("Enter the model id to be deleted:");
		int mid = sc.nextInt();

		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == mid) {
					rs.deleteRow();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void updateModelCost() {
		System.out.println("Enter the model name to be updated:");
		String mname = sc.next();

		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getString(2).equals(mname)) {// if this getString(1).equals(id)
					System.out.println("Old cost: " + rs.getFloat(3));
					System.out.println("Enter new cost: ");
					float cost = sc.nextFloat();

					rs.updateFloat(3, cost);
					rs.updateRow();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		ResultSetBike r1 = new ResultSetBike();
		int choice;
		char ch;

		do {
			System.out.println("What do you wannt to select: ");
			System.out.println("1. Add new model");
			System.out.println("2. Delete model");
			System.out.println("3. Update model cost");
			System.out.println("4. view all model");
			System.out.println("5. view model reverse");
			System.out.println("6. Exit");
			System.out.println("Enetr your choice: ");

			System.out.println("----------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				r1.insertModel();
				break;
			case 2:
				r1.deleteModel();
				break;
			case 3:
				r1.updateModelCost();
				break;
			case 4:
				r1.fetchModelDetails();
				break;
			case 5:
				r1.fetchModelDetailsReverse();
				break;
			case 6:
				System.out.println("Closing the model application");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input");
				break;
			}
			System.out.println("Do you want to perform more operatrions (Y - yes/ N - No)");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'N');
	}
}
