package com.objectpassing;

import java.util.Scanner;

import com.encapsulation.Book;

public class MyLibrary2 {
	static void insertRecord(Book b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book id: ");
		b.setBookId(sc.nextInt());
		
		System.out.println("Enter the book name: ");
		b.setBname(sc.next());
		
		System.out.println("Enter the book price: ");
		b.setPrice(sc.nextFloat());
	}
	public static void main(String[] args) {
		Book b1 = new Book();
		insertRecord(b1);
		System.out.println(b1);
		
		Book b2 = b1;//shallow copy
		b2.setPrice(3000);
		System.out.println("------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("------");
		
		Book b3 = new Book();
		b3 = b1;//shallow copy: change in one object is reflected in b1 object
		System.out.println(b1);
		b3.setPrice(5000);
		System.out.println("After changing price:");
		System.out.println(b1);
		System.out.println(b3);
	}



}
