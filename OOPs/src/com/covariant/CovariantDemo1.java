package com.covariant;

class First{
	Number value;
	Object diaplayValue() {
		return value;
	}
}
class Second extends First{
	Integer myVal;
	Integer dispalyValue() {
		myVal= 20;
		return myVal;
	}
}
public class CovariantDemo1 {
public static void main(String[] args) {
	First f1 = new First();
	f1.value=70;
	System.out.println("value is: "+f1.diaplayValue());
	
	Second s1 = new Second();
	System.out.println("value is: "+s1.dispalyValue());
	
	Second s2 = new Second();
	System.out.println("value is: "+(s2.dispalyValue()+10));
}
}
