package com.hashset;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("c");
		hs.add("java");
		//hs.add("c++");
		System.out.println(hs.add("c++"));//it will not add before it will return true
		hs.add("python");
		hs.add("angular");
		//hs.add(null);
//		hs.add("angular");
		System.out.println(hs.add("angular"));//it will already present so it will return false
		System.out.println(hs);
		
		//Mathematical operation
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("c");
		hs2.add("java");
		hs2.add("c++");
		
		//union
//		hs.addAll(hs2);
//		System.out.println(hs);
		
		//difference
//		hs.removeAll(hs2);
//		System.out.println(hs);
		
		//retainAll - intersection
		hs.retainAll(hs2);
		System.out.println(hs);
	}

}
