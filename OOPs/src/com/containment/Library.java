package com.containment;

public class Library {
public static void main(String[] args) {
	Author a1= new Author(101,"JKRolling");
	Author a2= new Author(102,"SudhaMurthy");
	
	Book b1 = new Book(1,"Harry Potter",1000,a1);
	Book b2 = new Book(2,"Mahashweta",1000,a2);
	Book b3 = new Book(3,"Magic of the lost temple",1000,a2);
	Book b4 = new Book(4,"Troubled Blood",1000,a1);
	Book b5 = new Book(5,"Mother I Never Knew",1000,a2);
	Book b6 = new Book(6,"ABC",760, new Author(103, "xyz"));
	Book b7 = new Book(6,"DEF",800, new Author(104, "uvx"));
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b3);
	System.out.println(b4);
	System.out.println(b5);
}
}
