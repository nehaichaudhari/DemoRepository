package com.thirtyoct;

public class FirLetCap {
	static void convertFirLetter(String st) {
		String splitst[] = st.split("\\s");
		for(int i=0;i<splitst.length;i++) {
			String s1 =splitst[i];
			char ch = s1.charAt(0);
			s1=Character.toUpperCase(ch)+s1.substring(1, s1.length());
			splitst[i]=s1;
			System.out.println(splitst[i]);
		}
	}

	public static void main(String[] args) {
		String str = "india is beautiful country";
		convertFirLetter(str);
	}

}
