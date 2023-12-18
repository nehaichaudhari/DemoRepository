package com.string1;

public class StringMutable {
	public static void main(String[] args) {
		String s1 = "java";
		System.out.println(s1.hashCode());
		s1="corejava";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		System.out.println("-------");
		
		String s2 = "Nilam";
		System.out.println(s2.hashCode());
		s2.concat("jagade");// here we cannot assign value so it will not change
		System.out.println(s2.hashCode());
		System.out.println(s2);
		System.out.println("-------");
		
		String s3 = "Nilam";
		System.out.println(s3.hashCode());
		s3=s3.concat("jagade");// here we do = therefore it will pointing to s3
		System.out.println(s3.hashCode());
		System.out.println(s3);
		System.out.println("-------");
		
		String s4 = "Nilamjagade";// once value is created then it will not change value
		System.out.println(s4.hashCode());//if it is present then it will pointing to that value only
		
		int num=89;
		System.out.println(num+90);
		System.out.println(num);
		
	}

}
