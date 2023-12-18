package com.twentyoct.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class FloatArray {
	public static void main(String[] args) {
		ArrayList<Float> al = new ArrayList<>();
		al.add(15.2f);
		al.add(20.45f);
		al.add(16.36f);
		al.add(45.2f);
		al.add(86.46f);
		
		System.out.println(al);
		
		//1st way
		//for loop
		System.out.println("1st way");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//2nd way - enhanced loop
		System.out.println("2nd loop");
		for(Float f: al) {
			System.out.println(f);
		}
		
		//3rd way-iterator
		System.out.println("3rd way");
		Iterator<Float> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//4th way
		System.out.println("4th way");
		ListIterator<Float> listitr = al.listIterator();
		while(listitr.hasNext()) {
			System.out.println(listitr.next());
		}
		
		//5th way
		System.out.println("5th way");
		ListIterator<Float> listitr1 = al.listIterator(al.size());
		while(listitr1.hasPrevious()) {
			System.out.println(listitr1.previous());
		}
	}

}
