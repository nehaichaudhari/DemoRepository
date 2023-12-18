package com.tweoct;

public class RemDupMainCode {
	static void removeDupl(String str) {
		int count;
		boolean visited;
		char ch[]=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			visited = false;
			for (int j = i - 1; j >= 0; j--) {
				if (ch[i] == ch[j]) {
					visited = true;
					break;
				}
			}
			if (visited == false) {
				for (int k = i + 1; k < str.length(); k++) {
					if (ch[i] == ch[k]) {
						count++;
					}
				}
				System.out.print(ch[i]);	
			}
		}
	}

	public static void main(String[] args) {
		String s1= "hello";
		removeDupl(s1);
	}

}
