package com.basicarrays;

import java.util.Scanner;

public class SearchAnArrayPosition {
	static void searchNo(int ar[], int n) {
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == n) {
				flag = true;
				System.out.println(n + " is present in array at position " + (i + 1));
			}
		}
		if (flag != true) {
			System.out.println(n + " digit is not present");
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 7, 8, 3, 2 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int x = sc.nextInt();
		searchNo(arr, x);
	}
}
