package com.overriding_and_overloading;

class Bakery {
	void bake() {
		System.out.println("Welcome to bakery");
	}

	void types() {
		System.out.println("we have all type of bread, cake and biscuits");
	}
}

class BreadBakery extends Bakery {
	void bake() {
		System.out.println("in bread class");
	}

	void types() {
		System.out.println("types of bread: brown bread, wheat bread, white bread");
	}

}

class CakeBakery extends Bakery {
	void bake() {
		System.out.println("in cake class");
	}

	void types() {
		System.out.println("types of cake: chocolate, white forest, black forest");
	}

}

class BiscuitBakery extends Bakery {
	void bake() {
		System.out.println("in biscuit class");
	}

	void types() {
		System.out.println("types of biscuit: chocolate biscuit, wheat biscuit, coconut biscuit");
	}
}

public class BakeryMain {
	public static void main(String[] args) {
		Bakery b1;
		b1=new Bakery();
		b1.bake();
		b1.types();
		System.out.println("--------");
		b1 = new BreadBakery();
		b1.bake();
		b1.types();
		System.out.println("--------");
		b1 = new CakeBakery();
		b1.bake();
		b1.types();
		System.out.println("--------");
		b1 = new BiscuitBakery();
		b1.bake();
		b1.types();
	}
}
