package com.arrays.fiveoct;

import java.util.Arrays;

public class DivBetArrAsc {
	static void divideArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length / 2; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length / 2; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 8, 5, 10, 4, 6, 3 };
		divideArray(arr);
	}

}
