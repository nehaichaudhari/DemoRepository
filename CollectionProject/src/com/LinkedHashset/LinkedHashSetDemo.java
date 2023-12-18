package com.LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("red");
		hs.add("blue");
		hs.add("green");
		System.out.println(hs.add("blue"));
		hs.add(null);
		hs.add("purple");
		System.out.println(hs);

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
