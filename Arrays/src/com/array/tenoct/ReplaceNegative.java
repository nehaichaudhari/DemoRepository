package com.array.tenoct;

import java.util.Arrays;
//replace negative with previous no's square
public class ReplaceNegative {
	static void checkNegative(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<=0) {
				ar[i]=ar[i-1]*ar[i-1];
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {12,3,-19,29,5,-66,44};
		System.out.println("before: "+Arrays.toString(arr));
		checkNegative(arr);
		System.out.println("after: "+Arrays.toString(arr));
	}

}
