package com.basicarrays;

import java.util.Arrays;

public class SumOfEvenArray {
	static int sumOfArray(int ar[]) {
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				sum += ar[i];
			}
		}
		return sum;
		/*System.out.println(Arrays.toString(ar));
		System.out.println("sum is: " + sum);*/
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8 };
		System.out.println("sum of array: "+sumOfArray(arr));
	}

}
