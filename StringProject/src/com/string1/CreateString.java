package com.string1;

public class CreateString {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("---------------");
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
