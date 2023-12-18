package com.elevenoct;

public class ReplaceDuplicate {
	static void replace(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str1.contains(""+ch)) {
				str1 += '$';
			}else
			str1 += ch;
			
		}
		System.out.println(str1);
	}

	public static void main(String[] args) {
		String s1 = "missisipi";
		replace(s1);
	}

}
