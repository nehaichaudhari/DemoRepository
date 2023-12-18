package com.string.array;

import java.util.Arrays;

public class DivideStringInEqual {
	static void divideString(String st, int noOfCh) {
		int len = st.length();
		// no of substring
		int n = len / noOfCh;
		if (len % noOfCh != 0) {
			System.out.println("we cannot divide string in equal parts:");
		} else {
			String spltstr[] = new String[n];
			int index = 0;
			for (int i = 0; i < len; i += noOfCh) {
				spltstr[index] = st.substring(i, i + noOfCh);
				index++;
			}
			System.out.println(Arrays.toString(spltstr));
		}
	}

	public static void main(String[] args) {
		String arr[] = { "I", "am", "very", "smart" };
		String s1 = String.join("", arr);
		System.out.println(s1);
		int noOfChars = 5;
		divideString(s1, noOfChars);
	}

}
