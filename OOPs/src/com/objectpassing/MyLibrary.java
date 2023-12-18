package com.objectpassing;
import java.util.Scanner;

import com.encapsulation.*;
public class MyLibrary {
	static Scanner sc = new Scanner(System.in);
	static void insertRecord(Book b) {
		//Scanner sc = new Scanner(System.in);
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
		
		Book b2 = new Book();
		insertRecord(b2);
		
		Book b3 = new Book();
		insertRecord(b3);
		
		System.out.println("-------");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
