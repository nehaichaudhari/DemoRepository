package com.elevenoct;

import java.util.Scanner;

public class ReplaceDuplicate1 {
	static String replaceDup(String st) {
		char ch[] = st.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					// System.out.println(j);
					ch[j] = '$';
				}
			}
		}

		st = new String(ch);

		return st;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word1:");

		String word = sc.next();

		System.out.println("Original word:" + word);

		word = replaceDup(word);

		System.out.println("New word:" + word);
	}
}
