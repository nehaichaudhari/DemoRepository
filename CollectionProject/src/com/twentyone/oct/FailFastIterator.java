package com.twentyone.oct;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("c");
		al.add("html");
		al.add("python");
		al.add("angular");
		
		//remove angular
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			if(itr.next().equals("angular"))
				//al.remove("angular"); give ConcurrentModificationException
				itr.remove();
		}
		System.out.println(al);
	}

}
