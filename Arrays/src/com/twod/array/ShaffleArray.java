package com.twod.array;

import java.util.Arrays;
import java.util.Random;

public class ShaffleArray {
	public static void main(String[] args) {
		int arr[] = { 5, 6, 23, 67, 39, 10, 2 };
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int j = r.nextInt((arr.length));
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
