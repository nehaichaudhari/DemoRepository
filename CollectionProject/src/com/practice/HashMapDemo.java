package com.practice;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Jan", 30);
		map.put("Feb", 28);
		map.put("Mar", 31);
		map.put("Apr", 30);
		map.put("May", 31);
		map.put("Jun", 30);

		HashMap<Integer, Integer> newMap = new HashMap<>();

		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			int count;
			String month = itr.next();
			int days = map.get(month);
			if (newMap.containsKey(days)) {
				count = newMap.get(days);
				count++;
			} else {
				count = 1;
			}
			newMap.put(days, count);
		}
		System.out.println(newMap);
	}

}
