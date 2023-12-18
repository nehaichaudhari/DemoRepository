package com.customeexception;

public class DigitIsPresent {
	static void checkDigitPresent(String arr[]) {
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (Character.isDigit(ch))
					throw new DigitFoundException("Digit found");
			}
		}
	}

	public static void main(String[] args) {
		String strarr[] = { "java1", "python", "c++" };
		checkDigitPresent(strarr);
	}

}
