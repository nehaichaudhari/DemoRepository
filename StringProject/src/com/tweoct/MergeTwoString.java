package com.tweoct;

import java.util.Scanner;

public class MergeTwoString {
	static void mergeString(String str1, String str2) {
		char ch[]=new char[str1.length()+str2.length()+1];
		int index=0;
		for(int i=0;i<str1.length();i++) {
			ch[index]=str1.charAt(i);
			index++;
		}
		ch[index]=' ';
		index++;
		for(int j=0;j<str2.length();j++) {
			ch[index]=str2.charAt(j);
			index++;
		}
		String str3 = new String(ch);
		System.out.println(str3);
		//System.out.println(Arrays.toString(ch));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st word: ");
		String s1 = sc.next();
		System.out.println("Enter the 2st word: ");
		String s2 = sc.next();
		mergeString(s1,s2);
	}

}
