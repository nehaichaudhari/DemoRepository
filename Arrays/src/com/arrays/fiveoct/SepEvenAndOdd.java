package com.arrays.fiveoct;

import java.util.Arrays;

public class SepEvenAndOdd {
	static void sepEveOdd(int ar[]) {
		int pos = 0;
		int ar1[] = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				ar1[pos] = ar[i];
				pos++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 != 0) {
				ar1[pos] = ar[i];
				pos++;
			}
		}
		System.out.println(Arrays.toString(ar1));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		sepEveOdd(arr);
	}

}
