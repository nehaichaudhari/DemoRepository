package com.arrays.fouroct;

public class PrintDuplicateElement {
	static void printDuplicate(int ar[]) {
		int count;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]=='\0')
				continue;
			    count=1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]='\0';
				}
			}
			if(count>1) {
				System.out.println(ar[i]);
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {3, 10, 90, 78, 56, 10, 78, 34, 61};
		System.out.println("duplicate elements are: ");
		printDuplicate(arr);
	}

}
