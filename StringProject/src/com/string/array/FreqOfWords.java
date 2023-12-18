package com.string.array;

public class FreqOfWords {
	static void checkFreq(String s) {
		String starr[] = s.split("\\s");
		int count;
		for (int i = 0; i < starr.length; i++) {
			if (starr[i].equals("visited"))
				continue;
			count = 1;
			for (int j = i + 1; j < starr.length; j++) {
				if (starr[i].equalsIgnoreCase(starr[j])) {
					count++;
					starr[j] = "visited";
				}
			}
			System.out.println(starr[i] + " -----> " + count);
		}
	}

	public static void main(String[] args) {
		String str = "A big cat is rolling on a big mat";
		checkFreq(str);
	}

}
