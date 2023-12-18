package com.jisatech.logicalassi;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.next();
		// g h o s t
		// 0,1,2,3,4
		boolean flag = true;
		for (int i = 0; i < s1.length() - 1; i++) {
			char ch = s1.charAt(i);// g
			char ch1 = s1.charAt(i + 1);// h
			System.out.println((int) ch);
			if (ch < ch1) {
				System.out.println(ch + " is before " + ch1);
			} else {
				flag = false;
				break;
			}
		}
		if (flag == true)
			System.out.println("String is alphabetical:");
		else
			System.out.println("String is not alphabetical:");
	}
}
