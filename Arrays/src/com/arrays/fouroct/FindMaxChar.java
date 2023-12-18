package com.arrays.fouroct;

public class FindMaxChar {
	static char findMaxChar(char ar[]) {
		char max = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		return max;
	}

	static char findMinChar(char ar[]) {
		char min = ar[0];
		for (int i = 0; i < ar.length; i++) {
			if (min > ar[i]) {
				min = ar[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		char arr[] = { 'A', 'D', 'E', 'x', 'z', 'R' };
		char arr1[]= {'A', 'D', 'E', 'x', 'R', 'Z', 'p'};
		System.out.println("max char is: " + findMaxChar(arr));
		System.out.println("min char is: "+findMinChar(arr1));
	}
}
