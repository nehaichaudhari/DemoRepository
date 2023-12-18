package com.thirtyoct;

public class FirLetCapWithoutMethod {
	static void convertFirLetter(String st) {
		String splitst[] = st.split("\\s");
		for (int i = 0; i < splitst.length; i++) {
			char ch[] = splitst[i].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[0] >= 'a' && ch[0] <= 'z') {
					ch[0] -= 32;
				}
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
		System.out.println(" ");
	}

	public static void main(String[] args) {
		String str = "india is beautiful country";
		convertFirLetter(str);
	}

}
