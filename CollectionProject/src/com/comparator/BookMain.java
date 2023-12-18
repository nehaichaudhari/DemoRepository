package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class BookMain {
	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		book.add(new Book(1, "c", 250f));
		book.add(new Book(2, "c++", 300f));
		book.add(new Book(3, "java", 400f));
		book.add(new Book(4, "angular", 150f));
		book.add(new Book(5, "python", 350f));

		System.out.println("=================================");
		for (Book b : book) {
			System.out.println(b);
		}
		Collections.sort(book, new BookIdComparator());
		System.out.println("-----------------------");
		for (Book b : book) {
			System.out.println(b);
		}
		
		
		//for name
		System.out.println("=================================");
		for (Book b : book) {
			System.out.println(b);
		}
		Collections.sort(book, new BookNameComparator());
		System.out.println("-----------------------");
		for (Book b : book) {
			System.out.println(b);
		}
		
		//for price
		System.out.println("=================================");
		for (Book b : book) {
			System.out.println(b);
		}
		Collections.sort(book, new BookPriceComparator());
		System.out.println("-----------------------");
		for (Book b : book) {
			System.out.println(b);
		}
		
		//for Name and price
		System.out.println("=================================");
		for (Book b : book) {
			System.out.println(b);
		}
		Collections.sort(book, new BookPriceAndNameComparator());
		System.out.println("-----------------------");
		for (Book b : book) {
			System.out.println(b);
		}
		
		
	}

}
