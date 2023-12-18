package com.arrays.fouroct;

public class PrintDupliEleChar {
	static void printUnique(char ar[]) {
		int count;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]=='0')//'\0' also null
				continue;
			count = 1;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]='0';
				}
			}
			if(count>=2) {
				System.out.println(ar[i]);
			}
		}
	}
	public static void main(String[] args) {
		char arr[] = {'a','b','d','a','c','a','b'};
		System.out.println("duplicate elements are: ");
		printUnique(arr);
	}

}
