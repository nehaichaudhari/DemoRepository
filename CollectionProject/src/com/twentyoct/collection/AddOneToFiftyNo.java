package com.twentyoct.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AddOneToFiftyNo {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			al.add(i);
		}
		System.out.println(al);

		// using Iterator
		Iterator<Integer> itr = al.iterator();
		System.out.println("using Iterator");
		while (itr.hasNext()) {
			int num = itr.next();
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

		// using for loop
		System.out.println("using for loop");
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) % 2 == 0) {
				System.out.println(al.get(i));
			}
		}

		// using for each loop
		System.out.println("using for each loop");
		for (Integer i : al) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
