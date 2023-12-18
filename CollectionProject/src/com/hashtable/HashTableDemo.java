package com.hashtable;

import java.util.Hashtable;

public class HashTableDemo {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		//ht.put(null, "Anonymous");
		ht.put(1, "Neha");
		ht.put(2, "Harshada");
		ht.put(3, "Madhu");
		ht.put(4, "Shivani");
		ht.put(5, "Shraddha");
		
		
		System.out.println(ht);
		System.out.println(ht.put(6, "Gauri"));// it will return null because it occure 1st time
		System.out.println(ht.put(6, "Dipti"));//it will return gauri because it is associate with old value
	}

}
