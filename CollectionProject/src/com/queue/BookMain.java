package com.queue;

import java.util.PriorityQueue;

public class BookMain {
	public static void main(String[] args) {
		//PriorityQueue<Book> bookpq = new PriorityQueue<>(new BookPriceComparator());
		PriorityQueue<Book> bookpq = new PriorityQueue<>();//if we give comparable to class then no need to give it in argument
		bookpq.add(new Book(1, "angular", 250f));
		bookpq.add(new Book(2, "c", 300f));
		bookpq.add(new Book(3, "c++", 350f));
		bookpq.add(new Book(4, "java", 150f));

		for (Book b : bookpq) {
			System.out.println(b);
		}
	}

}
