package com.string.logical;

public class StringIntern {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String ("java");
		//s2 = s2.intern();// true
		s2.intern();// false
		System.out.println(s1==s2);
		System.out.println(s1==s2.intern());
		
	}

}
