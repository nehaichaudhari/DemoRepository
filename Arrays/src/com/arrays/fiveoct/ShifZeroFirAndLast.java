package com.arrays.fiveoct;

import java.util.Arrays;

public class ShifZeroFirAndLast {
	static void shiftZeroStart(int ar[]) {
		int pos = 0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				for (int j = i; j > pos; j--) {
					temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
				pos++;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	static void shiftZeroEnd(int ar[]) {
		int pos = 0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				for (int j = i; j > pos; j--) {
					temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
				pos++;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 12, 3, 0, 5, 0, 6 };
		System.out.println("zero shift at the start");
		shiftZeroStart(arr);
		System.out.println("-------------------------------");
		System.out.println("zero shift at the end");
		shiftZeroEnd(arr);
	}

}
