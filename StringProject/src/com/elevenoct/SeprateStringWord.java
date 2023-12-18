package com.elevenoct;
public class SeprateStringWord {
	static void sepChar(String str) {
		String str1 = "";
		String str2="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				//str = str.replace(ch, '$');
				str1+='$';
				str2+=Character.toUpperCase(ch);
			}else {
				str1+=ch;
				str2+=ch;
			}
			System.out.println(ch);
		}
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
	}
	public static void main(String[] args) {
		String s1 = "hello";
		sepChar(s1);
	}

}
