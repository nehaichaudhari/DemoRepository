package com.basicarrays;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5};
		for(int i: arr) {
			System.out.println(i);
		}
		System.out.println("-----");
		//cube of each number
		for(int i:arr) {
			i=i*i*i;
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
