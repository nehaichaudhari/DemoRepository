package com.elevenoct;

public class DiffBetEquAndEqOp {
	static void compareEq(String str, String str1) {
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
	}
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "hello";
		compareEq(s1, s2);
		System.out.println("---------------");
		
		String s3= new String("hello");
		String s4= new String("hello");
		compareEq(s3, s4);
		System.out.println("---------------");
		
		/*String s5 = s3;//true --> == operator and equals
		compareEq(s3, s5);*/
		System.out.println(s1==s3);
		
	}

}
