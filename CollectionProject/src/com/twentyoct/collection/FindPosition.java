package com.twentyoct.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String str = sc.next();
		ArrayList<String> al = new ArrayList<>();
		al.add("rani");
		al.add("ram");
		al.add("shyam");
		al.add("seeta");
		al.add("geeta");
		System.out.println(al);
		System.out.println(al.indexOf(str));
	}

}
