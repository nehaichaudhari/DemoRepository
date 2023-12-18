package com.ninteenoct;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IerateArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("mango");
		al.add("banana");
		al.add("orange");
		al.add("kiwi");
		al.add("strawberry");
		System.out.println(al);

		System.out.println("----------------");
		// 1st way - enhanced loop
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("------------------");
		System.out.println("2nd way: ");
		for (String s : al) {
			System.out.println(s);
		}

		System.out.println("------------------");
		System.out.println("3rd way: ");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------");
		System.out.println("4th way: ");
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("------------------");
		System.out.println("5th way: ");
		ListIterator<String> litr1 = al.listIterator(al.size());
		while (litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
	}

}
