package com.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class SortByPrice {
	public static void main(String[] args) {
		HashSet<Item> hs = new HashSet<>();
		hs.add(new Item(1, "laptop", 45000));
		hs.add(new Item(2, "mobile", 20000));
		hs.add(new Item(3, "charger", 670));
		hs.add(new Item(1, "laptop", 45000));
		hs.add(new Item(4, "computre", 30000));

		TreeSet<Item> ts = new TreeSet<>();
		ts.addAll(hs);
		for(Item i:ts) {
			System.out.println(i);			
		}
	}

}
