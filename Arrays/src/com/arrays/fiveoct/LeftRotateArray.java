package com.arrays.fiveoct;

import java.util.Arrays;

public class LeftRotateArray {
	static void rotateByOnePos(int ar[]) {
		int firstEle=ar[0];
		for (int i = 0; i<ar.length-1; i++) {
			ar[i] = ar[i + 1];
		}
		ar[ar.length-1]=firstEle;
		// System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 4 };//{2,3,5,6,4,1}
		System.out.println("before:");
		System.out.println(Arrays.toString(arr));
		//for 1 time
		System.out.println("for 1 time shift: ");
		rotateByOnePos(arr);
		System.out.println(Arrays.toString(arr));
		// shift 3 time
		int n = 3;
		for (int i = 0; i < n; i++) {
			rotateByOnePos(arr);
		}
		System.out.println("for 3 time: ");
		System.out.println(Arrays.toString(arr));
	}

}
