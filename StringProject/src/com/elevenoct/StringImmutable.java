package com.elevenoct;

public class StringImmutable {
	static void checkImmutable() {
		String s1 = "hello";
		String s2 = "hello";
		//s1 = s1.concat("world");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		String s3 = new String("hello");
		System.out.println(s3.hashCode());
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println("--------------------------------");
		
		String str1=new String("Java");
		String str2=new String("Java");
		System.out.println(str1.hashCode()==str2.hashCode());
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
	}
	public static void main(String[] args) {
		checkImmutable();
	}

}
