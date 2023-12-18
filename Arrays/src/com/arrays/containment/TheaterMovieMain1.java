package com.arrays.containment;

import java.util.Arrays;
import java.util.Scanner;

public class TheaterMovieMain1 {
	static Scanner sc = new Scanner(System.in);
	static void enterDetails(Theater1 th) {
		System.out.println("enter the theater id: ");
		th.setId(sc.nextInt());
		
		System.out.println("theater name is: ");
		th.setTname(sc.next());
		
		System.out.println("Enter the no of movies: ");
		int size = sc.nextInt();
		Movie m1[] = new Movie[size];
		
		for(int i=0;i<m1.length;i++) {
			System.out.println("enter movie id: ");
			int id =sc.nextInt();
			
			System.out.println("movie name is: ");
			String name=sc.next();
			
			System.out.println("rating is: ");
			float rating =sc.nextFloat();
			m1[i]=new Movie(id, name, rating);
		}
		th.setM(m1);
	}
	
	static void printDetails(Theater1[] t1) {
		for(Theater1 tAr:t1) {
			System.out.println(tAr);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the no of theater: ");
		int no = sc.nextInt();
		Theater1 th1[]=new Theater1[no];
		for(int i=0;i<no;i++) {
			Theater1 theater = new Theater1();
			enterDetails(theater);
			th1[i]=theater;
		}
		printDetails(th1);
	}

}
