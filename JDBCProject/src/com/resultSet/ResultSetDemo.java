package com.resultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc1.DBConnect;

public class ResultSetDemo {
	static Scanner sc = new Scanner(System.in);
	Statement stmt;
	ResultSet rs;
	Connection conn = null;

	public ResultSetDemo() {
		conn = DBConnect.getConnect();
		try {
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery("select * from course");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fetchCourseDetails() {
		try {
			rs.beforeFirst();
			// rs = stmt.executeQuery("select * from course");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void fetchCourseDetailsReverse() {
		try {
			rs.afterLast();
			// rs = stmt.executeQuery("select * from course");
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5));
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void insertCourse() {
		try {
			rs.moveToInsertRow();

			System.out.println("Enter course id:");
			int cid = sc.nextInt();

			System.out.println("Enter the course name:");
			String cname = sc.next();

			System.out.println("Enter duration(in months):");
			int dur = sc.nextInt();

			System.out.println("Enter fees:");
			int fees = sc.nextInt();

			rs.updateInt(1, cid);
			rs.updateString(2, cname);
			rs.updateInt(3, dur);
			rs.updateInt(4, fees);

			rs.insertRow();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteCourse() {
		System.out.println("Enter the course id to be deleted:");
		int cid = sc.nextInt();

		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == cid) {
					rs.deleteRow();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void updateCourseFees() {
		System.out.println("Enter the course id to be updated:");
		String cname = sc.next();

		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getString(2).equals(cname)) {// if this getString(1).equals(id)
					System.out.println("Old fees: " + rs.getInt(4));
					System.out.println("Enter new fees: ");
					int fees = sc.nextInt();

					rs.updateInt(4, fees);
					rs.updateRow();
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ResultSetDemo r1 = new ResultSetDemo();
		int choice;
		char ch;

		do {
			System.out.println("What do you wannt to select: ");
			System.out.println("1. Add new Course");
			System.out.println("2. Delete Course");
			System.out.println("3. Update Course fees");
			System.out.println("4. view all courses");
			System.out.println("5. view course reverse");
			System.out.println("6. Exit");
			System.out.println("Enetr your choice: ");

			System.out.println("----------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				r1.insertCourse();
				break;
			case 2:
				r1.deleteCourse();
				break;
			case 3:
				r1.updateCourseFees();
				break;
			case 4:
				r1.fetchCourseDetails();
				break;
			case 5:
				r1.fetchCourseDetailsReverse();
				break;
			case 6:
				System.out.println("Closing the course application");
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
