package com.customeexception;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int no = sc.nextInt();
		try {
			if (no > 99999)
				throw new OutOfRangeException("no is out of range");
			System.out.println("no in range");
		} catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
	}

}
