package com.CRUDOperations;

import java.util.Scanner;

public class BankTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		BankImplementation bd = new BankImplementation();

		do {
			System.out.println("1. Add Bank");
			System.out.println("2. Show Bank Information");
			System.out.println("3. Add Account");
			System.out.println("4. Edit Account");
			System.out.println("5. Delete Account");
			System.out.println("6. Search Account");
			System.out.println("7. Exit");
			System.out.println("----------------------------");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				bd.addBank();
				break;
			case 2:
				bd.updateBank();
				break;
			case 3:
				bd.showBank();
				break;
			case 4:
				bd.deleteBank();
				break;
			case 5:
				bd.searchBank();
				break;
			case 6:
				bd.addAccount();
				break;
			case 7:
				System.exit(0);
			}
		} while (true);
	}

}
