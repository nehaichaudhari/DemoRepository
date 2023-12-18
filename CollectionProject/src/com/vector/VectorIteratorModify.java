package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorIteratorModify {
	public static void main(String[] args) {
		Vector<String> lang = new Vector<>();
		lang.add("c");
		lang.add("java");
		lang.add("python");
		lang.add("angular");
		lang.add(".net");
		
		lang.add("java");
		System.out.println(lang);
		
		Enumeration<String> en = lang.elements();
		while(en.hasMoreElements()) {
			if(en.nextElement().equals("java"))
				lang.remove("java");//remove all java
		}
		System.out.println(lang);
	}

}
