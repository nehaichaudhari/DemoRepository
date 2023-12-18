package com.elevenoct;

import java.util.Scanner;

public class AnagramWithoutSwapping {
	static void checkAnagram(String str1, String str2) {
		boolean flag = true;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				flag = false;
				for (int j = 0; j < str2.length(); j++) {
					if (str1.charAt(i) == str2.charAt(j)) {
						flag = true;
						break;
					}
				}
			}
			if (flag == true) {
				System.out.println("string is anagram");
			} else
				System.out.println("string is not anagram");
		}else
			System.out.println("String is not anagram");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word1: ");
		String word1 = sc.next();
		System.out.println("Enter a word2: ");
		String word2 = sc.next();
		checkAnagram(word1, word2);
	}

}
