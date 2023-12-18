package com.twentyone.oct;

import java.util.ArrayList;

public class ReverseArrayList {
	static void reverseList(ArrayList<String> list) {
		for(int i=0,j=list.size()-1;i<list.size()/2;i++,j--) {
			String temp=list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Orange");
		al.add("Apple");
		al.add("Pinapple");
		al.add("Mango");
		al.add("Kiwi");
		System.out.println("Before: "+al);
		reverseList(al);
		System.out.println("After: "+al);
	}

}
