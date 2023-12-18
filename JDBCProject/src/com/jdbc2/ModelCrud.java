package com.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCrud {
	static Connection conn = null;
	Statement stmt;
	ResultSet rs;
	PreparedStatement ptmt;
	static Scanner sc = new Scanner(System.in);

	public ModelCrud() {
		conn = DBConnect.getConnect();
		System.out.println("Connection Done...");
		try {
			stmt = conn.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void showDetails() {
		try {
			rs = stmt.executeQuery("select * from model");
			System.out.println("model details-- ");
			while (rs.next()) {
				System.out.println("Model id: " + rs.getInt(1) + "  Model name: " + rs.getString(2) + "  Model cost: "
						+ rs.getInt(3));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void insertDetails() {
		System.out.println("Enter the model id: ");
		int mId = sc.nextInt();

		System.out.println("Enter the model name: ");
		String mName = sc.next();

		System.out.println("Enter the cost: ");
		int cost = sc.nextInt();
		try {
			ptmt = conn.prepareStatement("insert into model values(?,?,?)");
			ptmt.setInt(1, mId);
			ptmt.setString(2, mName);
			ptmt.setInt(3, cost);

			int noOfRowsInserted = ptmt.executeUpdate();
			if (noOfRowsInserted > 0) {
				System.out.println("Model added....");
			} else {
				System.out.println("Error in model....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteModel() {
		System.out.println("Enter the model id to be deleted: ");
		int mId = sc.nextInt();

		try {
			ptmt = conn.prepareStatement("delete from model where model_id=?");
			ptmt.setInt(1, mId);

			int noOfRowsDeleted = ptmt.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("Model " + mId + " is deleted...");
				showDetails();
			} else
				System.out.println("Error in deleteing model...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean searchCourseById(int mId) {
		boolean isFound = false;
		try {
			ptmt = conn.prepareStatement("select * from model where model_id=?");
			ptmt.setInt(1, mId);

			rs = ptmt.executeQuery();

			while (rs.next()) {
				isFound = true;
				System.out.println("model id :" + rs.getInt(1));
				System.out.println("model name:" + rs.getString(2));
				System.out.println("cost:" + rs.getInt(3));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isFound;

	}

	public void updateModel() {
		System.out.println("Enter model id whose cost is to updated:");
		int mId = sc.nextInt();

		if (searchCourseById(mId)) {
			System.out.println("Ente the new cost:");
			int cost = sc.nextInt();

			try {
				ptmt = conn.prepareStatement("update model set cost=? where model_id=?");
				ptmt.setFloat(1, cost);
				ptmt.setInt(2, mId);

				int noOfRowsUpdated = ptmt.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Model updated .....");
					searchCourseById(mId);
				} else {
					System.out.println("Error in updating model.........");
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			System.out.println("model " + mId + " not found..");
		}
	}

	public static void main(String[] args) {
		ModelCrud m = new ModelCrud();
		int ch;
		char choice;

		do {
			System.out.println("What do you want to select: ");
			System.out.println("1. Show all model");
			System.out.println("2. Insert model");
			System.out.println("3. Delete model by Id");
			System.out.println("4. Search by Id");
			System.out.println("5. Update model by Id");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");
			System.out.println("------------------------------");

			ch = sc.nextInt();
			switch (ch) {
			case 1:
				m.showDetails();
				break;
			case 2:
				m.insertDetails();
				break;
			case 3:
				m.deleteModel();
				break;
			case 4:
				System.out.println("Enter model_id: ");
				int model_id = sc.nextInt();
				m.searchCourseById(model_id);
				break;
			case 5:
				m.updateModel();
				break;
			case 6:
				System.out.println("Closing the model application");
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
				break;
			}
			System.out.println("Do you want to perform more operation (Y - yes/ N - No)");
			choice = sc.next().charAt(0);
		} while (choice == 'Y' || choice == 'N');
	}
}
