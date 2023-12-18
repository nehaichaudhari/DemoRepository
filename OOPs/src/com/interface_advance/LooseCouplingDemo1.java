package com.interface_advance;
interface Keyboard{
	String display();
}
class Dell implements Keyboard{

	@Override
	public String display() {
		return "dell keyboard is used";
	}
}
class HP implements Keyboard{

	@Override
	public String display() {
		return "HP keyboard is used";
	}
}
class Key{
	public void display(Keyboard k) {
		System.out.println(k.display());
	}
}
public class LooseCouplingDemo1 {
	public static void main(String[] args) {
		Key k1 = new Key();
		Keyboard k2;
		k2 = new Dell();
		k1.display(k2);
		
		k2 = new HP();
		k1.display(k2);
	}

}
