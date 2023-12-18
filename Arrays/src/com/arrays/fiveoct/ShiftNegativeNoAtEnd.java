package com.arrays.fiveoct;

import java.util.Arrays;

public class ShiftNegativeNoAtEnd {
	static void shiftNegEnd(int ar[]) {
		int pos = 0;
		int temp;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				temp = ar[i];
				ar[i] = ar[pos];
				ar[pos] = temp;
				pos++;
			}

		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, -4, -5, 6 };
		shiftNegEnd(arr);
	}

}
