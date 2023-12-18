package com.ninteenoct;

import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayList {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		
		list1.add(12);
		list1.add("shuruti");
		list1.add(56.7f);
		list1.add('A');
		
		System.out.println(list1);
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
			int data = (int)list1.get(i)+10;//class cast exception
			list1.set(i, data);
		}
		System.out.println(list1);
	}

}
