package com.string1;

public class EqualsComparison {
	public static void main(String[] args) {
		//==
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("---------");
		
		String s3=new String("hi");
		String s4=new String("hi");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//== compares the reference
		//.equals = it will check for content
	}

}
