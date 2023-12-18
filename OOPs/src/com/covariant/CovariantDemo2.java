package com.covariant;
class First1{
	Number value;
	Object diaplayValue() {
		return value;
	}
}
class Second1 extends First1{
	Integer myVal;
	Integer dispalyValue() {
		myVal= 20;
		return myVal;
	}
}
class Third extends First1{
	Character ch;
	  
	  Character displayValue()
	  {
	  	ch='A';
	  	return ch;
	  }
}
public class CovariantDemo2 {
	public static void main(String[] args) {
		First1 f= new First1();
		f.value=89;
		System.out.println("Value is:"+f.diaplayValue());
		
		Second1 s1= new Second1();
		System.out.println("Value is :"+((int)(s1.diaplayValue())+10));
		
		Second1 s2= new Second1();
		System.out.println("Value is :"+(s2.diaplayValue())+10);
	}

}
