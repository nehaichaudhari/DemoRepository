package com.arrays.fiveoct;

public class SumOffirstAndLast {
	static void sumOfArray(int ar[]){
		int sum=0;
		for(int i=0,j=ar.length-1;i<ar.length/2;i++,j--) {
			sum=ar[i]+ar[j];
			System.out.println("sum is: "+sum);
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,3,4,5,6};
		sumOfArray(arr);
	}

}
