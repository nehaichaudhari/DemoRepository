package com.companyJdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RegionsCrud {
	static Connection conn = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pstmt;
	static Scanner sc = new Scanner(System.in);

	public RegionsCrud() {
		conn = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchAllRegions() {
		try {
			pstmt = conn.prepareStatement("select * from regions_copy");
			rs = pstmt.executeQuery();
			System.out.println("Region details: ");
			while (rs.next()) {
				System.out.println("Region id: " + rs.getDouble(1) + "  region name: " + rs.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void fetchRegionById(double region_id) {
		try {
			pstmt = conn.prepareStatement("select region_name from regions_copy where region_id = ?");
			pstmt.setDouble(1, region_id);
			rs = pstmt.executeQuery();
			System.out.println("Regions:---");
			rs.next();
			System.out.println(rs.getString(1));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertRegion() {
		System.out.println("Enter region id:");
		double rid = sc.nextDouble();

		System.out.println("Enter the region name:");
		String rname = sc.next();

		try {
			pstmt = conn.prepareStatement("insert into regions_copy values(?,?)");
			pstmt.setDouble(1, rid);
			pstmt.setString(2, rname);

			int noOfRowsInserted = pstmt.executeUpdate();

			if (noOfRowsInserted > 0) {
				System.out.println("Region added.....");
			} else {
				System.out.println("Error in Region....");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteRegion() {
		System.out.println("Enter the region id to be deleted:");
		double rid = sc.nextDouble();

		try {
			pstmt = conn.prepareStatement("delete from regions_copy where region_id=?");
			pstmt.setDouble(1, rid);

			int noOfRowsDeleted = pstmt.executeUpdate();

			if (noOfRowsDeleted > 0) {
				System.out.println("Region " + rid + " is deleted");
				fetchAllRegions();
			} else {
				System.out.println("Error in deleting region...");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public boolean searchRegionById(double rid) {
		boolean isFound = false;
		try {
			pstmt = conn.prepareStatement("select * from regions_copy where region_id=?");
			pstmt.setDouble(1, rid);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				isFound = true;
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return isFound;

	}

	public void updateRegion() {
		System.out.println("Enter region id to update:");
		double rid = sc.nextDouble();

		if (searchRegionById(rid)) {
			fetchRegionById(rid);
			System.out.println("Ente the new name:");
			String name = sc.next();

			try {
				pstmt = conn.prepareStatement("update regions_copy set region_name=? where region_id=?");
				pstmt.setString(1, name);
				pstmt.setDouble(2, rid);
				int noOfRowsUpdated = pstmt.executeUpdate();
				if (noOfRowsUpdated > 0) {
					System.out.println("Region updated .....");
				} else {
					System.out.println("Error in updating region.........");
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		} else {
			System.out.println("Region " + rid + " not found..");
		}
	}

	public static void main(String[] args) {

		RegionsCrud r1 = new RegionsCrud();
		int choice;
		char ch;

		do {
			System.out.println("What do you wannt to select: ");
			System.out.println("1. Get region name based on id");
			System.out.println("2. Add new region");
			System.out.println("3. Delete Region");
			System.out.println("4. Update Region name");
			System.out.println("5. Get all regions");
			System.out.println("6. Exit");
			System.out.println("Enetr your choice: ");

			System.out.println("----------------------");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter region id: ");
				int region_id = sc.nextInt();
				r1.fetchRegionById(region_id);
				break;
			case 2:
				r1.insertRegion();
				break;
			case 3:
				r1.deleteRegion();
				break;
			case 4:
				r1.updateRegion();
				break;
			case 5:
				r1.fetchAllRegions();
				break;
			case 6:
				System.out.println("Closing the region application");
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
