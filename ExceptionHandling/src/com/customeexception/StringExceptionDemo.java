package com.customeexception;

public class StringExceptionDemo {
	static void checkLength(String strarr[]) {
		for(int i=0;i<strarr.length;i++) {
			if(strarr[i].length()<3) 
				System.out.println(strarr[i]);
				throw new InvalidStringException("string is less than 3");
		}
	}
	public static void main(String[] args) {
		String strarr[]= {"c","java","angular","python"};
		checkLength(strarr);
	}

}
