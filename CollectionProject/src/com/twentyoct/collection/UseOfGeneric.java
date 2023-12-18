package com.twentyoct.collection;

import java.util.ArrayList;
import java.util.List;

public class UseOfGeneric {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("radha");
		list.add(12);
		list.add(52.3f);
		list.add('a');
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			int data = (int)list.get(i) + 10;// class cast exception and class cast exception
			list.set(i, data);
		}
		System.out.println(list);
		
		//using generic
		
//        List <String> list1 = new ArrayList<>();
//		
//		list1.add("ram");
//		list1.add("shyam");
//		list1.add("seeta");
//		list1.add("geeta");
//		
//		System.out.println(list1);
//		
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//			String data = list1.get(i)+" name";
//			list1.set(i, data);
//		}
//		System.out.println(list1);
	}

}
