package com.varags;

public class VarargsDemo {
	static void display(int ar[]) {
		for(int i:ar) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	//ellipsis
	//method overloaded.......no of arguments
	static void displayEle(int ...a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6};
		int arr3[]= {7,8,9};
		display(arr1);
		display(arr2);
		display(arr3);
		System.out.println("------------");
		displayEle(5);
		displayEle(1,2,3,4,5,6);
		displayEle(8,6,4,8);
	}
}
