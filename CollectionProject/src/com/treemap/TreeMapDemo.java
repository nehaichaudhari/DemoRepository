package com.treemap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tmap = new TreeMap<>();

		tmap.put(3, "Java");
		tmap.put(1, "html");
		tmap.put(8, "C");
		tmap.put(4, "c++");

		System.out.println(tmap);
		System.out.println("==================================");
		// Iterating
		Set<Integer> keys = tmap.keySet();

		Iterator<Integer> itr = keys.iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + tmap.get(key));
		}

		//
		System.out.println("=====================================");
		for (Map.Entry<Integer, String> e : tmap.entrySet()) {
			System.out.println(e.getKey() + e.getValue());

		}

		//
		System.out.println("=====================================");
		Set<Entry<Integer, String>> entries = tmap.entrySet();
		for (Entry<Integer, String> e : entries) {
			System.out.println(e.getKey() + e.getValue());
		}
		// Reverse Iteration
		System.out.println("=====================================");
		NavigableMap<Integer, String> ns = tmap.descendingMap();
		for (Map.Entry<Integer, String> e : ns.entrySet()) {
			System.out.println(e.getKey() + e.getValue());
		}
		//
		System.out.println("=====================================");
		NavigableSet<Integer> ns1 = tmap.navigableKeySet();
		for (Integer i : ns1) {
			System.out.println(i + tmap.get(i));
		}
	}
}
