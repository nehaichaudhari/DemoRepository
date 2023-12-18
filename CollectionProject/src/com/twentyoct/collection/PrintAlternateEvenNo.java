package com.twentyoct.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintAlternateEvenNo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
		System.out.println(al);

		// using for loop
		System.out.println("using for loop");
		for (int i = 0; i < al.size(); i = i + 2) {
			System.out.println(al.get(i));
		}

		// using for each loop
		System.out.println("using for each loop");
		for (Integer i : al) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// using iterator
		System.out.println("using iterator");
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			int num = itr.next();
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
	}

}
