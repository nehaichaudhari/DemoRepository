package com.twentyoct.collection;

import java.util.ArrayList;

public class IntgerArray {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(2);
		al.add(45);
		al.add(86);
		al.add(42);
		al.add(19);
		
		System.out.println(al);
		
		//get method
		System.out.println("-------get---------");
		//System.out.println(al.get(4));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//set method
		System.out.println("--------set----------");
		al.set(2, 100);
		System.out.println(al);
		
		//retainAll
		System.out.println("----------retainAll-------------");
		ArrayList<Integer> al2 = new ArrayList<>();
		al.add(15);
		al.add(2);
		al.add(42);
		System.out.println(al.retainAll(al2));//return type is boolean
		
		//removeAll
		System.out.println("-------removeAll--------");
		System.out.println(al2.removeAll(al2));
		
		//add method
		System.out.println("-------add----------");
		al.add(11);
		al.add(22);
		al.add(33);
		System.out.println(al);
	}

}
