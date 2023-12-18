package com.seventeenoct;

public class CountNoAvgInStringWithoutMethod {
	static void checkNoAvg(String str) {
		int sum=0;
		int count=0;
		char ar[]=str.toCharArray();
		for (int i = 0; i < ar.length; i++) {
			//char ch = str.charAt(i);
			if(ar[i]>=48 && ar[i]<=57) {
				sum+=ar[i]-48;
				count++;
			}
//			if(Character.isDigit(ch)) {
//				sum+=Character.getNumericValue(ar[i]);
//				count++;
////				count++;
////				int no=Integer.parseInt(""+ch);
////				sum=sum+no;
//			}
		}
		System.out.println("avg is: "+sum/count);
	}

	public static void main(String[] args) {
		String s1 = "a5i9gfj4tabc";
		checkNoAvg(s1);
	}

}
