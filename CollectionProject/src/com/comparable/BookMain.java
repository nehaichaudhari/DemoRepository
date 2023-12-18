package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class BookMain {
	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();
		book.add(new Book(1, "angular", 250f));
		book.add(new Book(2, "c", 300f));
		book.add(new Book(3, "c++", 350f));
		book.add(new Book(4, "java", 150f));

		for (Book b : book) {
			System.out.println(b);
		}

		Collections.sort(book);
		
		System.out.println("-------------------");
		for (Book b : book) {
			System.out.println(b);
		}

	}

}
