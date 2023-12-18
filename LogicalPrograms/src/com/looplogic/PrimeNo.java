package com.looplogic;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		int count;
		//System.out.println("Enter value:");
		System.out.println("Enter the value for n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the value for n1: ");
		int n1=sc.nextInt();
		System.out.println("Prime numbers between " +n+ " to " + n1 + " are ");
		for (int j = n; j <= n1; j++) {
			count = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {//2%1==0
					count++;//3
				}
			}
			if (count == 2)
				System.out.print(j + "  ");
		}

	}
}
