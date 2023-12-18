package com.arrays.fouroct;

import java.util.Scanner;

public class RainFall {
	static void avgRainFall(float ar[]) {
		float sum = 0.0f;
		float avg = 0.0f;
		for(int i = 0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println("sum is: "+sum);
		avg=sum/ar.length;
		System.out.println("avg is: "+avg);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size= sc.nextInt();
		float arr[] = new float[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value: ");
			arr[i]=sc.nextFloat();
		}
		avgRainFall(arr);
	}

}
