package com.looplogic;

public class KrishnaMurthyNo {

	static void checkKrishna(int num) {
		int originalNo = num;
		//int fact = 1;
		int sum = 0;
		while(num!=0) {
			int r = num % 10;
			int fact = 1;
			for (int i = 1; i <= r; i++) {
				fact = fact * i;
				System.out.println("fact is: " + fact);
			}
			sum +=fact;
			num /= 10;
			System.out.println("sum is: " + sum);
			System.out.println("num is: " + num);
		}
		if (sum == originalNo) {
			System.out.println("no is krishnaMurthy no");
		} else
			System.out.println("no is not krishnaMurthy no");
	}

	public static void main(String[] args) {
		int num = 145;
		// KrishnaMurthyNo krishna = new KrishnaMurthyNo();
		checkKrishna(num);

	}

}
