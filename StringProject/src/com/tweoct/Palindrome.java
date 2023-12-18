package com.tweoct;

import java.util.Scanner;

public class Palindrome {
	static void checkPali(String str) {
		char ch[]=str.toCharArray();
		boolean flag = true;
		for(int i=0,j=ch.length-1;i<ch.length;i++,j--) {
			    if(ch[i]!=ch[j]) {
					flag = false;
					break;
				}
		}
		if(flag==true) {
			System.out.println("String is palindrome");
		}else
			System.out.println("String is not palindrome");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String s1 = sc.next();
		checkPali(s1);
	}

}
