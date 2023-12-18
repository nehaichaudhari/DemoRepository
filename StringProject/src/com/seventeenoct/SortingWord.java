package com.seventeenoct;

import java.util.Scanner;

public class SortingWord {
	static void soringWord(String str) {
		char ch[]=str.toCharArray();
		boolean flag = true;
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i]>ch[i+1]) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Word is sorted");
		}else
			System.out.println("word is not sorted");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s1 = sc.next();
		soringWord(s1);
	}

}
