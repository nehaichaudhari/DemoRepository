package com.hashmap;

import java.util.HashMap;

public class Putexample {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("madhu", 15);
		hm.put("harshada", 20);
		hm.put("gauri", 25);
		hm.put("shraddha", 5);
		System.out.println(hm.put("shraddha", 10));
	}

}
