package com.twentyone.oct;

import java.util.ArrayList;

public class FrequenceArrayList {
	static void calFreq(ArrayList<String> list) {
		int count;
		for (int i = 0; i < list.size(); i++) {
			count = 1;
			if (list.get(i).equals("visited"))
				continue;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
					list.set(j, "visited");
				}
			}
			System.out.println(list.get(i) + " ---> " + count);
		}
	}

	// find duplicate
	static void findDuplicate(ArrayList<String> list) {
		int count;
		for (int i = 0; i < list.size(); i++) {
			count = 1;
			if (list.get(i).equals("visited"))
				continue;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
					list.set(j, "visited");
				}
			}
			if (count > 1) {
				System.out.println(list.get(i) + " ----> " + count);
			}
		}
	}

	// find unique
	static void findUnique(ArrayList<String> list) {
		int count;
		for (int i = 0; i < list.size(); i++) {
			count = 1;
			if (list.get(i).equals("visited"))
				continue;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
					list.set(j, "visited");
				}
			}
			if (count == 1) {
				System.out.println(list.get(i) + " ----> " + count);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("A");
		al.add("C");
		al.add("A");
		al.add("B");
		al.add("D");
		// calFreq(al);
		// findDuplicate(al);
		findUnique(al);

	}

}
