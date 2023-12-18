package com.vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> lang = new Vector<>(5,2);//2 is a increment factor if not given then it will grow by 50%
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("c");
		lang.add("java");
		lang.add("python");
		lang.add("angular");
		lang.add(".net");
		System.out.println(lang.capacity());
		System.out.println(lang.size());
		
		lang.add("c++");
		System.out.println("-----------------------------------");
		System.out.println(lang.capacity());//capacity double
		System.out.println(lang.size());
		System.out.println("-----------------------------------");
		System.out.println(lang);
		
		System.out.println(lang.get(3));
		System.out.println(lang.elementAt(4));//legacy method only in vector
		System.out.println("---------------------------------");
		System.out.println(lang.remove(4));
		System.out.println(lang.removeElement("c++"));
		System.out.println("----------------------------------");
		System.out.println(lang.set(1, "springboot"));
		lang.setElementAt("AWS", 0);
		System.out.println(lang);
	}
}
