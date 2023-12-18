package com.tweoct;

public class RemoveDuplicate {
	static void removeDup(String str) {
		String str1 = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(!str1.contains(""+ch)) {
				str1+=ch;
			}
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		String s1 = "hello java";
		removeDup(s1);
	}

}
