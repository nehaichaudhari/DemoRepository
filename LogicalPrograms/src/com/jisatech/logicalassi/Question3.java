package com.jisatech.logicalassi;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");

		String s1 = sc.nextLine();
		String rev = "";
		for (int i = s1.length() - 1, j = 0; i >= 0; i--, j++) {
			char ch1 = s1.charAt(i);
			char ch2 = s1.charAt(j);
			if (ch1 != ' ') {
				if (ch2 == ' ') {
					rev += ' ';
					rev += ch1;
				} else {
					if (Character.isUpperCase(ch2)) {
						ch1 = Character.toUpperCase(ch1);
					} else if (Character.isLowerCase(ch2)) {
						ch1 = Character.toLowerCase(ch1);
					}
					rev += ch1;
				}
			} else {
				if (ch2 == ' ') {
					rev += ' ';
				}
			}
		}

		System.out.println(rev);
		sc.close();

	}
}
