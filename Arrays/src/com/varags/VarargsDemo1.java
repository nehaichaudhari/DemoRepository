package com.varags;

public class VarargsDemo1 {
	static void m1(int n1,int n2) {
		System.out.println(n1+n2);
	}
	static void m2(int n1,int n2,int n3) {
		System.out.println(n1+n2+n3);
	}
	
	static void m3(int ...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println("sum: "+sum);
	}
	//rule 1: there can be only 1 varargs
	//static void display(int ...a, String ...s){
//   }
	
	//relw2: varargs:last argumen in the method
	static void printMe(int num, String ...str){
		System.out.println(num);
		for(String s:str) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		m1(5,6);
		m2(3, 5, 6);
		m3(2,1,5,4,5);
		m3(8,9,6,5,7,5,6,2);
		printMe(2, "abc","sjf","jdkj");
		
	}

}
