package com.string.array;

public class StringReverse {
	static void reverseWord(String s) {
		String splitst[] = s.split("\\s");
		String revst = "";
		for (int i = 0; i < splitst.length; i++) {
			for (int j = splitst[i].length() - 1; j >= 0; j--) {
				revst = revst + splitst[i].charAt(j);
			}
			revst = revst + " ";
		}
		System.out.println("afetr: " + revst);
	}

	public static void main(String[] args) {
		String str = "I like to learn java";
		System.out.println("before: " + str);
		reverseWord(str);
	}

}
