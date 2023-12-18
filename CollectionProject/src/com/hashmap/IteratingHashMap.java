package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingHashMap {
	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
		hm.put("Kailash", 89.6);
		hm.put("Neha", 89.6);
		hm.put("Madhu", 99.3);
		hm.put("Harshada", 65.5);
		hm.put("Shivani", 52.6);
		
		System.out.println(hm.put("gauri", 68.2));
		
		//1st way
		System.out.println(hm);
		
		//2nd way
		System.out.println("====================");
		Set<String> keys = hm.keySet();
		for(String s:keys) {
			System.out.println(s+"---->"+ hm.get(s));
		}
		System.out.println("=====================");
		//using iterator first we need to set the value then convert
		Iterator<String> itr = hm.keySet().iterator();//here keys reference is use
		while(itr.hasNext()) {
			String k = itr.next();
			System.out.println(k+"----->"+hm.get(k));
		}
		
		System.out.println("======================");
		//for value only --- 4th way
		Collection<Double> marks = hm.values();
		for(Double m:marks) {
			System.out.println(m);
		}
		
		System.out.println("===================");
		//using entrySet -- 5th way
		Set<Entry<String, Double>> entries = hm.entrySet();
		for(Entry<String, Double> e:entries) {
			System.out.println(e.getKey()+"----->"+e.getValue());
		}
		
		System.out.println("==================");
		//using entry --- 6th way
		for(Map.Entry<String, Double> e:hm.entrySet()) {
			System.out.println(e.getKey()+"---->"+e.getValue());
		}
		
		System.out.println("7th way");
		Set<Entry<String, Double>> entrySet = hm.entrySet();
		Iterator<Entry<String, Double>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Double> entry = iterator.next();
			System.out.println(entry.getKey()+"--->"+entry.getValue());
		}
	}

}
