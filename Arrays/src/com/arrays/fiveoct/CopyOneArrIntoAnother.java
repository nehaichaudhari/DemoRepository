package com.arrays.fiveoct;

import java.util.Arrays;

public class CopyOneArrIntoAnother {
	static void copyArray(int ar[]) {
		int ar1[] = new int[ar.length];
		for(int i=0;i<ar.length;i++) {
			ar1[i]=ar[i];
		}
		System.out.println(Arrays.toString(ar1));
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		copyArray(arr);
	}

}
