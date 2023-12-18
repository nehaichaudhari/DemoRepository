package com.basicarrays;

import java.util.Arrays;

public class SortingArray {
	static void sortAr(int ar[]) {
		for(int i = 0;i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				//sort - ascending
				//for descending change the sign
				if(ar[i]>ar[j]) {
					//swapping
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,5,7,2,9,6};
		System.out.println("before sorting: "+Arrays.toString(arr));
		sortAr(arr);
		System.out.println("after sorting: "+Arrays.toString(arr));
	}

}
