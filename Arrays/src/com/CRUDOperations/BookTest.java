package com.CRUDOperations;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		BookDetails bd = new BookImplementation();

		do {
			System.out.println("1. Add Book");
			System.out.println("2. Update Book");
			System.out.println("3. Show Book Information");
			System.out.println("4. Delete Book");
			System.out.println("5. Search Book by id");
			System.out.println("6. Exit");
			System.out.println("----------------------------");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				bd.addBook();
				break;
			case 2:
				bd.updateBook();
				break;
			case 3:
				bd.showBook();
				break;
			case 4:
				bd.deleteBook();
				break;
			case 5:
				bd.searchBook();
				break;
			case 6:
				System.exit(0);
			}
		} while (true);
	}
}
