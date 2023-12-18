package com.arrays.fouroct;

public class PrimeNoInArray {
	static int checkPrimeNo(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j =2;j<=ar[i];j++) {
				if(ar[i]%j==0) {
				count++;
				}
			}
			if(count==1) {
				System.out.println("prime no are: "+ar[i]);
				sum = sum+ar[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,11,12,8};
		System.out.println("sum is: "+checkPrimeNo(arr));
	}

}
