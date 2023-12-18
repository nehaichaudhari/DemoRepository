package com.jisatech.logicalassi;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentance:");
		String s1 = sc.nextLine();
		String reverseCase = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (Character.isUpperCase(ch)) {
				reverseCase += Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				reverseCase += Character.toUpperCase(ch);
			} else {
				reverseCase += ch;
			}
		}

		System.out.println(reverseCase);
	}
}
