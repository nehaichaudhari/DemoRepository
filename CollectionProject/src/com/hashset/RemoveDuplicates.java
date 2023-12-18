package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("java");
		al.add("c");
		al.add("java");
		al.add("spring");
		al.add("spring");
		al.add("c++");
		System.out.println(al);
		
		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);
	}

}
