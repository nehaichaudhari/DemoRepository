package com.twentyone.oct;

import java.util.ArrayList;

public class SortingIntegerArrayList {
	static void sortList(ArrayList<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(8);
		al.add(5);
		al.add(10);
		al.add(12);
		al.add(7);
		al.add(15);
		System.out.println("Before: "+al);
		sortList(al);
		System.out.println("After: "+al);
	}

}
