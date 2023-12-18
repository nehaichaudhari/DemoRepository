package com.arrays.fiveoct;

public class PairOfSum {
	static void findPair(int ar[],int s) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>s)
				continue;
				for(int j=i+1;j<ar.length;j++) {
					if((ar[i]+ar[j])==s) {
						System.out.println("("+ar[i]+" , "+ar[j]+")");
					}
				}
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,4,5,6,7,2,3};
		int sum = 7;
		findPair(arr, sum);
	}

}
