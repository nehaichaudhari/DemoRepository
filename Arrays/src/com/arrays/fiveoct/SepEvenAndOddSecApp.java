package com.arrays.fiveoct;

import java.util.Arrays;

public class SepEvenAndOddSecApp {
	static void sepEveOdd(int ar[]) {
		int pos = 0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				temp = ar[i];
				ar[i] = ar[pos];
				ar[pos] = temp;
				pos++;
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 6, 7, 8, 10,1 };
		sepEveOdd(arr);
	}

}
