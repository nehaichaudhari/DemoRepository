package com.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BookAuthorHashMap {

	public static void createMapCount(ArrayList<Book>b1)
	{
		HashMap<Author,Integer> h1=new HashMap<>();
		
		for(Book b:b1)
		{
			if(h1.containsKey(b.getAthr()))
				h1.put(b.getAthr(),h1.get(b.getAthr())+1);
			else
				h1.put(b.getAthr(), 1);
		}
		for(Map.Entry<Author, Integer>e:h1.entrySet())
		{
		  System.out.println(e.getKey()+"--->"+e.getValue());
		}
		
	}
	//create key:Author
	//value:ArrayList<Book>
	public static void createMapBook(ArrayList<Book>b1)
	{
		HashMap<Author,ArrayList<Book>> h1=new HashMap<>();
		ArrayList<Book>books;
		for(Book b:b1)
		{
			if(h1.containsKey(b.getAthr()))
			{
				books=h1.get(b.getAthr());
			}
			else
			{
				books=new ArrayList<>();
			}
			books.add(b);
			h1.put(b.getAthr(), books);
		}
		for(Map.Entry<Author, ArrayList<Book>>e:h1.entrySet())
		{
		  System.out.println(e.getKey());
		  System.out.println("-------------------------------------------");
		  for(Book b:e.getValue())
		  {
			  System.out.println(b.getBid()+","+b.getName()+","+b.getPrice());
		  }
		  System.out.println("===========================================================");
		}
		
	}
	//create Key:author
	//value:BookNames<String>
//	public static void createMapBookNames(ArrayList<Book>b1)
//	{
//		HashMap<Author,ArrayList<String>> h1=new HashMap<>();
//		ArrayList<String>books;
//		for(Book b:b1)
//		{
//			if(h1.containsKey(b.getAthr()))
//			{
//				books=h1.get(b.getAthr());
//			}
//			else
//			{
//				books=new ArrayList<>();
//			}
//			books.add(b);
//			h1.put(b.getAthr(), books);
//		}
//		for(Map.Entry<Author, ArrayList<Book>>e:h1.entrySet())
//		{
//		  System.out.println(e.getKey());
//		  System.out.println("-------------------------------------------");
//		  for(Book b:e.getValue())
//		  {
//			  System.out.println(b.getBid()+","+b.getName()+","+b.getPrice());
//		  }
//		  System.out.println("===========================================================");
//		}
//		
//	}
	public static void main(String[] args) {
		ArrayList<Book> b=new ArrayList<>();
		
		b.add(new Book(101,"Harry Potter",1045,new Author(1,"JK Rowling")));
		b.add(new Book(102,"Hamlet",980,new Author(2,"William Shakespere")));
		b.add(new Book(103,"Fantastic Beasts",786,new Author(1,"JK Rowling")));
		b.add(new Book(104,"The ChristMas Pig",630,new Author(1,"JK Rowling")));
		b.add(new Book(105,"Othello",1230,new Author(2,"william Shakespere")));
		b.add(new Book(106,"The clear blue sky",565,new Author(3,"Narayan Murthy")));

		System.out.println("===================================================");
		
		createMapCount(b);
		System.out.println("===================================================");
		
		createMapBook(b);
	}

}
