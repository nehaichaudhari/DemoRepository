package com.stringbufferbuilder;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();// capacity is changes only time of object creation
		sb1.append("java");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		sb1.append(" programs");
		System.out.println(sb1);
		
		sb1.replace(0,1, "p");
		System.out.println(sb1);
		sb1.replace(1, 4, "p");
		System.out.println(sb1);
		sb1.replace(0, 1, "java");
		System.out.println(sb1);
		System.out.println(sb1.delete(4, 5));
		System.out.println(sb1.charAt(6));
		System.out.println(sb1.indexOf("va"));
		sb1.reverse();
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.substring(2, 7));
		System.out.println(sb1.capacity());
		
	}

}
