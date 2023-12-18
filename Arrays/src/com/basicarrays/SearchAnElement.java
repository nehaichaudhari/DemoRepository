package com.basicarrays;

import java.util.Scanner;

public class SearchAnElement {
	static void searchNo(int ar[],int n) {
		boolean flag = false;
		for(int i = 0; i<ar.length;i++) {
			if(ar[i]==n) {
				flag = true;
				break;
			}
		}
		if(flag == true) {
			System.out.println("digit is present");
		}else {
			System.out.println("digit is not present");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,5,7,8,3};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the digit: ");
		int x = sc.nextInt();
		searchNo(arr,x);
	}

}
