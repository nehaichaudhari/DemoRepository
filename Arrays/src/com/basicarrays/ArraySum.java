package com.basicarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[] = new int[3];
		int sum =0;
		for(int i = 0; i<arr.length;i++) {
			System.out.println("Enter the value: ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum is: "+sum);
		float ar[] = {23.1f,15.21f,10.3f,4.5f};
		float sumj = 0.0f;
		for(int j=0;j<ar.length;j++) {
			sumj+=ar[j];
		}
		System.out.println(Arrays.toString(ar));
		System.out.println("sum of j is: "+sumj);
	}

}
