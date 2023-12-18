package com.wrapper;

public class WrapperClassDemo {
	public static void main(String[] args) {
		int num = 23;
		Integer i = new Integer(45);

		// convert
		Integer j = Integer.valueOf(num);

		// autoboxing automatic
		Integer k = num;
		System.out.println(num + " " + i + " " + j + " " + k);

		// unboxing - wrapper to primitive

		Float f1 = new Float(23.4f);

		float f2 = f1.floatValue();

		// unboxning auto
		float f3 = f1;
		System.out.println(f1 + " " + f2 + " " + f3);
	}
}
