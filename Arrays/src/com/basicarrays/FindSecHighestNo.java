package com.basicarrays;

import java.util.Arrays;

public class FindSecHighestNo {
	static void findNo(int ar[]) {
		for(int i = 0;i<ar.length;i++) {
			for(int j = i+1;j<ar.length;j++) {
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
		findNo(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[arr.length-2]);
		//System.out.println(arr[1]);
	}

}
