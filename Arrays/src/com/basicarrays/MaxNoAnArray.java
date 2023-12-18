package com.basicarrays;

public class MaxNoAnArray {
	static void findMaxNo(int ar[]) {
		int max =ar[0];
		for(int i =0;i<ar.length;i++) {
			if(max<ar[i]) {
				max = ar[i];
			}
		}
		System.out.println("max no is: "+max);
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		findMaxNo(arr);
	}

}
