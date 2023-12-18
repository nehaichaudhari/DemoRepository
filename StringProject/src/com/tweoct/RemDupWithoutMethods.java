package com.tweoct;

public class RemDupWithoutMethods {
	static void removeDuplicate(String str) {
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]=='\0') {
				continue;
			}
			int count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			System.out.print(ch[i]);
		}
	}
	public static void main(String[] args) {
		String s = "hello java";
		removeDuplicate(s);
	}

}
