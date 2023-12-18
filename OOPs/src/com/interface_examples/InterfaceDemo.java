package com.interface_examples;
interface Bakery{
	String bname= "nobel bakery";// if not give public static final it give by default public static final
	void bake();//it will take public abstract
}
class Cake implements Bakery{

	@Override
	public void bake() {
		System.out.println("we bake cakes: chocolate, butterscotch");
	}
}
class Biscuit implements Bakery{

	@Override
	public void bake() {
		System.out.println("we have biscuits: wheat, chocochips");
	}
	
	void minOrder() {
		System.out.println("min packing of 250g");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		System.out.println("bakery name: "+Bakery.bname);
		Cake c = new Cake();
		c.bake();
		
		Biscuit b1 = new Biscuit();
		b1.bake();
		b1.minOrder();
		
		Bakery b;
		b=new Biscuit();
		b.bake();
		//b.minOrder();// not allow because it is not overriden method
		b=new Cake();
		b.bake();
	}
}
