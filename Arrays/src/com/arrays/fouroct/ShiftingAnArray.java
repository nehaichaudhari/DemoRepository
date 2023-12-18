package com.arrays.fouroct;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingAnArray {
	static void add(int ar[],int index,int val) {
		for(int i=ar.length-1;i>index;i--) {
			ar[i]=ar[i-1];
		}
		ar[index]=val;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for(int i=0;i<arr.length-1;i++) {
			System.out.println("Enter the value: ");
			arr[i]=sc.nextInt();
		}
		System.out.println("before: "+Arrays.toString(arr));
		add(arr, 2, 100);
		System.out.println("after: "+Arrays.toString(arr));
	}

}
