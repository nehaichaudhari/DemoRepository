package com.basicarrays;

public class SumUsingEnhamcedLoop {
	public static void main(String[] args) {
		int arr[] = {3,5,8,6,9,15,10,21,30};
		int sum = 0;
		for(int i : arr) {
			if(i%3==0 && i%5 == 0) {
				sum+=i;
			}
		}
		System.out.println("sum is: "+sum);
	}

}
