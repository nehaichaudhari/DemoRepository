package com.seventeenoct;

public class NameString {
	static void nameString(String str) {
		String splitarr[] = str.split("\\s");
		String str1 = "";
		for (int i = 0; i < splitarr.length; i++) {
			if (i == splitarr.length - 1) {
				str1 += splitarr[i];
			} else {
				char ch = splitarr[i].charAt(0);
				str1 += ch + ".";
			}
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String s1 = "Sonal kishor Pawar";
		nameString(s1);
	}

}
