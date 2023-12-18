package com.string.array;

public class MinRepWord {
	static void findMinRepWord(String str) {
		String starr[] = str.split("\\s");
		int count;
		int minCount=Integer.MAX_VALUE;
		String word = null;
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
			if(count<minCount) {
				minCount=count;
				word=starr[i];
			}
		}
		System.out.println("Most repeated word: "+word);
	}

	public static void main(String[] args) {
		String s = "I love my India because my country and my country is great";
		findMinRepWord(s);
	}

}
