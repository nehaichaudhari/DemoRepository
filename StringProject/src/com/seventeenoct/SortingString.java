package com.seventeenoct;

import java.util.Scanner;

public class SortingString {
	static void sortString(String str) {
		String splitarr[] = str.split("\\s");
		boolean flag = true;
		for(int j=0;j<splitarr.length;j++) {
			char ch[] = splitarr[j].toCharArray();
			for (int i = 0; i < ch.length - 1; i++) {
				if (ch[i] > ch[i + 1]) {
					flag = false;
				}
			}
			
		}
		if (flag == true) {
			System.out.println("Word is sorted");
		} else
			System.out.println("word is not sorted");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = sc.next();
		sortString(s1);
	}

}
