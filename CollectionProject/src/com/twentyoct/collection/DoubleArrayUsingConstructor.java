package com.twentyoct.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DoubleArrayUsingConstructor {
	public static void main(String[] args) {
		ArrayList<Double> al= new ArrayList<>();
		al.add(15.2);
		al.add(28.56);
		al.add(36.55);
		System.out.println(al);
		
		//2nd way
		Double []douarr= {12.32,55.13,63.56,40.38};
		
		ArrayList<Double> al2=new ArrayList<>(Arrays.asList(douarr));
		System.out.println(al2);
		
		//3rd way
		ArrayList<Double> al3 = new ArrayList<>();
		Collections.addAll(al3, douarr);
		System.out.println(al3);
	}

}
