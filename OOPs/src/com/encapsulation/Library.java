package com.encapsulation;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBookId(101);
		b1.setBname("harry potter");
		b1.setPrice(690);

		System.out.println(b1.getBookId() + " " + b1.getBname() + " " + b1.getPrice());
		
		System.out.println(b1);
		
		//user input
		Book b2 = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the book id: ");
		b2.setBookId(sc.nextInt());
		System.out.println("Enter the book name: ");
		b2.setBname(sc.next());
		System.out.println("Enter the book price: ");
		b2.setPrice(sc.nextFloat());
		System.out.println(b2);
	}

}
