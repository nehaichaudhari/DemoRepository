package com.arrays.fouroct;

public class PrintUniqueElement {
	static void printUnique(int ar[]) {
		int count;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]=='\0')
				continue;
			count = 1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]='\0';
				}
			}
			if(count==1) {
				System.out.println(ar[i]);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {3,2,1,3,2,5,8,3};
		System.out.println("unique elements are: ");
		printUnique(arr);
	}

}
