package com.string.array;

public class PrintUniqueString {
	static void uniqueString(String str1[], String str2[]) {
		boolean found;
		for (String s : str2) {
			found = false;
			for (String si : str1) {
				if (s.equals(si)) {
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println(s);
			}
		}
	}

	public static void main(String[] args) {
		String s1[] = { "harshada", "shivani", "dipti" };
		String s2[] = { "neha", "madhu", "dipti","gauri" };
		uniqueString(s1, s2);
	}

}
