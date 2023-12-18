package com.string.array;

import java.util.Arrays;

public class StringArraySort2 {

	static void sortArrayLength(String st[]) {
		for (int i = 0; i < st.length; i++) {
			for (int j = i + 1; j < st.length; j++) {
				if (st[i].length() == st[j].length()) {
					String temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				} else {
					if (st[i].length() > st[j].length()) {

						String temp = st[i];
						st[i] = st[j];
						st[j] = temp;

					}

				}
			}
		}
	}

	public static void main(String[] args) {
		String str[] = { "java", "c", "devops", "c++", "phython", "angular", "html" };
		System.out.println("berfor: " + Arrays.toString(str));
		sortArrayLength(str);
		System.out.println("after sort on length: " + Arrays.toString(str));
	}
}
