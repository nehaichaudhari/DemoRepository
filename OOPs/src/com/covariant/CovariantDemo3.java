package com.covariant;
class Covariant{
	Object show() {
		System.out.println("in covariant class");
		return new Object();
	}
}
class SubCovariant extends Covariant{
	Integer show() {
		return 10;
	}
}
class SubCovariant1 extends Covariant{
	String show() {
		super.show();
		return "Radha";
	}
}
public class CovariantDemo3 {
	public static void main(String[] args) {
		Covariant c1;
		c1 = new SubCovariant();
		System.out.println(c1.show());
		c1=new SubCovariant1();
		System.out.println(c1.show());
	}

}
