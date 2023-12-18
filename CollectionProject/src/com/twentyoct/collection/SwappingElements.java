package com.twentyoct.collection;

import java.util.ArrayList;

public class SwappingElements {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(25);
		int temp = al.get(0);
		al.set(0, al.get(1));
		al.set(1, temp);
		System.out.println(al);
	}

}
