package com.constructor;

public class MyClass {
	int a;
	int b;
	
	MyClass(){
		this(10,20);
	}
	
	MyClass(int a, int b){
		this.a=a;
		this.b=b;
	}
	void display() {
		int a;
		a=99;
		System.out.println("Local:" +a);//99 :local variable
		System.out.println("Intance:"+this.a);// instance variable
		//addition(this);// 4. to call one method from another method
	}

}
