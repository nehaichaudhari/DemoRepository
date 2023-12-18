package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();
		al.add("mango");
		al.add("cherry");
		al.add("banana");
		al.add("orange");
		al.add("kiwi");

		// print
		System.out.println(al);
		System.out.println("---------------------");
		System.out.println("using ListIterator backword");
		ListIterator<String> litr = al.listIterator(al.size());
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		// using ListIterator forward
		System.out.println("---------------------");
		System.out.println("using ListIterator forward");
		ListIterator<String> litr1 = al.listIterator();
		while (litr1.hasNext()) {
			System.out.println(litr1.next());
		}

		// using iterator
		System.out.println("----------------");
		System.out.println("using iterator");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// using for loop
		System.out.println("----------------");
		System.out.println("using for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// using enhanced for loop
		System.out.println("----------------");
		System.out.println("using enhanced for loop");
		for (String s : al) {
			System.out.println(s);
		}

	}

}
