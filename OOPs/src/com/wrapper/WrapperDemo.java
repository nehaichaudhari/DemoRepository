package com.wrapper;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 10;
		char c = 'a';
		String s = "123";

		Integer i = Integer.valueOf(a);
		System.out.println(Integer.valueOf(a));
		
		Integer i1 = i.valueOf(s);
		System.out.println("using value of: "+i1);
		
		//System.out.println("using parse int: "+Integer.parseInt(s));
		//System.out.println(Integer.parseInt("abc"));
		//System.out.println(Integer.parseInt("xyz")+10);//getting exception NumberFormatException
		
		System.out.println(Integer.valueOf(s));
		System.out.println(Integer.parseInt(s));
		
		Character c1 = Character.valueOf(c);
		System.out.println("using get numeric vlaue funtion: "+Character.getNumericValue(c));
	
		System.out.println(Integer.max(44, 45));
		System.out.println(i + " " + c1);
		
	}
}