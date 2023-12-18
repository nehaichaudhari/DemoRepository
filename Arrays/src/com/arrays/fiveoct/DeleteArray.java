package com.arrays.fiveoct;

import java.util.Arrays;

public class DeleteArray {
	static void deleteArray(int ar[],int pos,int size) {
		size=ar.length-1;
		for(int i=pos;i<size;i++) {
			ar[i]=ar[i+1];
		}
		for(int i=0;i<size;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};//{1,2,3,5,6}
		deleteArray(arr, 3,4);
	}

}
