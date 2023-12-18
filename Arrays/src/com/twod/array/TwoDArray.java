package com.twod.array;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the no of col: ");
		int col = sc.nextInt();
		int arr[][]= new int[row][col];
		System.out.println("Enter the element: ");
		for(int i=0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
