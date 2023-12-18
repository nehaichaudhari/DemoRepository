package com.seventeenoct;

public class CountNoAvgInString {
	static void checkNoAvg(String str) {
		int sum=0;
		int count=0;
		char ar[]=str.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			//char ch = str.charAt(i);
			if(Character.isDigit(ar[i])) {
				sum+=Character.getNumericValue(ar[i]);
				count++;
			}
		}
		System.out.println("avg is: "+sum/count);
	}

	public static void main(String[] args) {
		String s1 = "a5i9gfj4tabc";
		checkNoAvg(s1);
	}

}
