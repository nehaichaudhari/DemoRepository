package com.looplogic;

public class ExtractDigits {
	static void extract(int num) {
		while (num != 0) {
			int r = num % 10;
			System.out.println(r);
			num /= 10;
			System.out.println("num is: "+num);
		}
	}

	static void productDigits(int num) {
		int product = 1;
		while (num != 0) {
			int r = num % 10;
			product *= r;
			num /= 10;
		}
		System.out.println(product);
	}

	static void sumDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum += r;
			num /= 10;
		}
		System.out.println(sum);
	}

	static void countDigits(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		int num = 2378;
		extract(num);
		productDigits(num);
		sumDigits(num);
		countDigits(num);

	}
}
