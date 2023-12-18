package com.string.array;

import java.util.Arrays;

public class StringArraySort {
	static void sortArrayLexo(String st[]) {
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].compareTo(st[j])>0) {
					String temp =st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}
	static void sortArrayLength(String st[]) {
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].length()>st[j].length()) {
					String temp =st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		String str[] = {"java","c", "c++","phython","angular"};
		System.out.println("berfor: "+Arrays.toString(str));
		sortArrayLexo(str);
		System.out.println("after sort: "+Arrays.toString(str));
		sortArrayLength(str);
		System.out.println("after sort on length: "+Arrays.toString(str));
	}		
}
