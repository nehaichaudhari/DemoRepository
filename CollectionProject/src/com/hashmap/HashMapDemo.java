package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		System.out.println(hm.isEmpty());
		hm.put("Kailash", 89.6);
//		hm.put(null, 0.0);
//		hm.put(null, 100.0);//replace null, 0 with 100
		hm.put("Neha", 89.6);
		hm.put("Madhu", 99.3);
		hm.put("Harshada", 65.5);
		
		System.out.println(hm);
		System.out.println(hm.put("Neha", 100.0));
		System.out.println(hm.size());
		//get
		System.out.println("marks: "+hm.get("Madhu"));
		System.out.println("contain key: "+hm.containsKey("Gauri"));
		System.out.println("contain key: "+hm.containsKey("Madhu"));
		System.out.println("contain value: "+hm.containsValue(89.6));
		//putIfAbsent
		
		System.out.println(hm.putIfAbsent("Neha", 63.5));
		System.out.println(hm);
		
		System.out.println(hm.putIfAbsent("Suraj", 78.0));
		System.out.println(hm);
		
		
	}

}
