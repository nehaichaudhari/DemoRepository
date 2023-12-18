package com.arrays.fouroct;

import java.util.Arrays;

public class MergeTwoArray {
	static int[] mergeArray(int ar1[], int ar2[]) {
		int mar[] = new int[ar1.length+ar2.length];
		int i =0;
		for(int j=0;j<ar1.length;j++) {
			mar[i]=ar1[j];
			i++;
		}
		for(int j=0;j<ar2.length;j++) {
			mar[i]=ar2[j];
			i++;
		}
		return mar;
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {11,12,13};
		int mergeArray[]=mergeArray(arr1, arr2);
		System.out.println(Arrays.toString(mergeArray));
	}

}
