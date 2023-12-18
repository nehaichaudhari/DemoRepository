package com.twentyoct.collection;

import java.util.ArrayList;

public class ComNameBetTwoString {
	static void commonName(ArrayList<String> al, ArrayList<String> al2) {
		for (int i = 0; i < al.size(); i++) {
			for (int j = 0; j < al2.size(); j++) {
				if (al.get(i).equals(al2.get(j))) {
					System.out.println(al.get(i));
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Neha");
		al.add("Gauri");
		al.add("Madhu");
		al.add("Harshada");
		al.add("Shivani");
		System.out.println(al);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Neha");
		al2.add("Madhu");
		al2.add("Harshada");
		System.out.println(al2);
//		al.retainAll(al2);
//		System.out.println("common: "+al);
		
		commonName(al, al2);

	}

}
