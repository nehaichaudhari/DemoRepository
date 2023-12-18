package com.interface_advance;
interface Foldable{
	void fold();
}
class Mobile{
	public void type(String name, int price) {
		System.out.println("we have various types of mobile: samsung, apple, vivo "+name);
		System.out.println("price is: "+price);
	}
}
class Samsung extends Mobile implements Foldable{ // we can extend class and also implement interface  
	public void display() {
		super.type("samsung", 25000);
		System.out.println("samsung mobile feature: ");
	}

	@Override
	public void fold() {
		System.out.println("foldable is the new feature added");
	}
} 
public class MobileMain {
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		s1.display();
		s1.fold();
	}

}
