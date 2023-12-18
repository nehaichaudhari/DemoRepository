package com.jisatech.logicalassi;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		String alphaWord = "";
		boolean isAlphabetical = false;
		for (int i = 0; i < words.length; i++) {
			String s1 = words[i];
			boolean flag = true;
			for (int j = 0; j < s1.length() - 1; j++) {
				char ch = Character.toLowerCase(s1.charAt(j));
				char ch1 = Character.toLowerCase(s1.charAt(j + 1));

				if (Character.isAlphabetic(ch) && Character.isAlphabetic(ch1) && ch > ch1) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				if(s1.length() > 2) {
				isAlphabetical = true;
				}
				alphaWord = s1;
				break;
			}
		}
		System.out.println(isAlphabetical);
		System.out.println(alphaWord);
		sc.close();
	}
}
