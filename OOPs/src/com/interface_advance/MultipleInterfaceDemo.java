package com.interface_advance;
interface InterfaceDemo1{
	void display();
}
interface InterfaceDemo2{
	void display();
}
class Demo implements InterfaceDemo1,InterfaceDemo2{

	@Override
	public void display() {
		System.out.println("in display method");
	}	
}
public class MultipleInterfaceDemo {
	public static void main(String[] args) {
		InterfaceDemo1 i1 = new Demo();
		i1.display();
		
		InterfaceDemo2 i2 = new Demo();
		i2.display();
		
	}

}
