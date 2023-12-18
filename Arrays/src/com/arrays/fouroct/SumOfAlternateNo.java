package com.arrays.fouroct;

public class SumOfAlternateNo {
	static int findSumOfAltNo(int ar[]) {
		int sum=0;
		for(int i = 0;i<ar.length;i++) {
			if(i%2==0) {
				sum = sum+ar[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {9,5,9,4,3,6,1,2};
		findSumOfAltNo(arr);
		System.out.println("sum of alternate no is: "+findSumOfAltNo(arr));
	}

}
