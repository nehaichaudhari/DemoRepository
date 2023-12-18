package com.arrays.fouroct;

import java.util.Arrays;

public class MergeArrSecApp {
	static int[] mergeTwoArrInAlt(int ar1[], int ar2[]) {
		int mar[] = new int[ar1.length+ar2.length];
		int index=0;
		int maxLength = Math.max(ar1.length, ar2.length);
		for(int i=0;i<maxLength;i++) {
			if(i<ar1.length) {
				mar[index]=ar1[i];
				index++;
			}
			if(i<ar2.length) {
				mar[index]=ar2[i];
				index++;
			}
		}
		return mar;
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5,6};
		int arr2[]= {11,12,13};
		int mergeArr[] = mergeTwoArrInAlt(arr1, arr2);
		System.out.println(Arrays.toString(mergeArr));
	}

}
