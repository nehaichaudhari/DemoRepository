package com.stringbufferbuilder;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(5);// if give then it will give that much only
//		System.out.println(sb1.capacity());
//		StringBuffer sb2 = new StringBuffer("hello"); // default capacity + string size
//		System.out.println(sb2.capacity());
//		StringBuffer sb3 = new StringBuffer();// default capacity is 16
//		System.out.println(sb3.capacity());
		// to add string having append method
		
		sb1.append("java");
		System.out.println(sb1);
		System.out.println("capacity: "+sb1.capacity());
		
		sb1.append("hello");
		System.out.println(sb1);
		System.out.println("capacity: "+sb1.capacity());//(oldcap*2)+2
		
	}
}
