package com.varags;
class Parent{
	static void display(int ...n) {
		for(int i:n) {
			System.out.println(i);
		}
	}
}
class Child extends Parent{
	//@Override
	static void display(int ...ar) {
		// when we override then it will give error because the 
		int sum=0;
		for(int i:ar) {
		sum+=i;
			System.out.println(sum);
		}
	}
}
public class VarargsOverriding {
	public static void main(String[] args) {
		
	}

}
