package com.twod.array;

import java.util.Scanner;

public class TransposeArray {
	static void transArray(int ar[][], int row, int col) {
		int row1 = col;
		int col1 = row;
		int arr1[][]=new int[row1][col1];
		for(int i=0;i<row1;i++) {
			for(int j =0;j<col1;j++) {
				arr1[i][j]=ar[j][i];
			}
		}
		for(int i=0;i<row1;i++) {
			for(int j =0;j<col1;j++) {
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
		checkMax(arr1, row1, col1);
	}
	static void checkMax(int ar[][], int row, int col) {
		int max;
		for(int i=0;i<col;i++) {
			max = ar[i][0];
			for(int j=0;j<row;j++) {
				if(max<ar[j][i]) {
					max=ar[j][i];
				}
			}
			System.out.println("max no is: "+max);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row=2;
		int col=3;
		int arr[][]=new int[row][col];
		System.out.println("Enter the ele: ");
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j =0;j<col;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("-----------");
		transArray(arr, row, col);
	}

}
