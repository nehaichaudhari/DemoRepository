package com.thirtyoct;

public class RemoveExtraSpaces {
	static void removeExtraSpace(String st) {
		String splitarr[] = st.split("\\s");
		String newStr = "";
		for (int i = 0; i < splitarr.length; i++) {
			if (splitarr[i].length() > '\0') {
				newStr+=splitarr+" ";
			}
			System.out.println(newStr);
		}
	}

	public static void main(String[] args) {
		String str = "I am  Neha   Chaudhari";
		removeExtraSpace(str);
	}

}
