package com.statickeyword;

public class Demo1 {
	static int i;//0
	public static void main(String[] args) {
		int j=++i;//1
		System.out.println(i);
		System.out.println((i++)+(j--*i));//1+1*2
	}
}
