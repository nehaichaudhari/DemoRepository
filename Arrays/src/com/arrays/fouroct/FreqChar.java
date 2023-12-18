package com.arrays.fouroct;

public class FreqChar {
	static void findFreqChar(char ar[]) {
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
			System.out.println(ar[i]+" ---> "+count);
		}
	}
	public static void main(String[] args) {
		char arr[] = {'a','b','d','a','c','a','b'};
		findFreqChar(arr);
	}

}
