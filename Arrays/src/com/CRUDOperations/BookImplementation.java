package com.CRUDOperations;

import java.util.Scanner;

public class BookImplementation implements BookDetails {
	Scanner sc = new Scanner(System.in);
	Book b[] = new Book[10];
	int id, price;
	String bname, aname;
	int count = 0;

	@Override
	public void addBook() {
		System.out.println("Add book");
		System.out.println("Enter the no of books you want to add");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.println("Enter book id: ");
			id = sc.nextInt();
			System.out.println("Enter book name: ");
			bname = sc.next();
			System.out.println("Enter book price: ");
			price = sc.nextInt();
			System.out.println("enter author name: ");
			aname = sc.next();
			b[count] = new Book(id, bname, price, aname);
			count++;
		}
		System.out.println("Add book sucessufully");
	}

	@Override
	public void updateBook() {
		System.out.println("Update Book");
		System.out.println("Enter the book id you want to update");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == b[i].getId() && b[i]!=null) {
				System.out.println("Enter book price");
				price=sc.nextInt();
				b[i].setPrice(price);
			}
		}
		System.out.println("Update book sucessfully");
	}

	@Override
	public void showBook() {
		for (int i = 0; i < count; i++) {
			System.out.println(b[i]);
		}

	}

	@Override
	public void deleteBook() {
		System.out.println("Delete Book");
		System.out.println("Enter the book id you want to delete");
		int bid = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (bid == b[i].getId()) {
				b[i] = null;
			}
			System.out.println("Delete book sucessfully");
		}
	}

	@Override
	public void searchBook() {
		System.out.println("Delete Book");
		System.out.println("Enter the book id you want to search");
		int bid = sc.nextInt();
		int flag = 0;
		int i;
		for(i=0;i<count;i++) {
			if(bid == b[i].getId() && b[i]!=null) {
				flag=1;
				break;
			}
		}
		if(flag==1){
			System.out.println("Given book available");
			System.out.println(b[i]);
		}else {
			System.out.println("Given book is not available");
		}
	}

}
