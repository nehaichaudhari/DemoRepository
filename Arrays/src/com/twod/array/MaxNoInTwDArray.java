package com.twod.array;

public class MaxNoInTwDArray {
	static void checkMax(int ar[][]) {
		int max;
		int min;
		for(int i=0;i<ar.length;i++) {
			max = ar[i][0];
			min = ar[i][0];
			for(int j=0;j<ar[i].length;j++) {
				if(max<ar[i][j]) {
					max=ar[i][j];
				}
				if(ar[i][j]<min) {
					min=ar[i][j];
				}
			}
			System.out.println("max no is: "+max);
			System.out.println("min no is: "+min);
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{22, 31, 9}, {12, 25, 16}};
		checkMax(arr);
	}

}
