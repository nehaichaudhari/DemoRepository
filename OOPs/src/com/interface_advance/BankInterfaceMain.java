package com.interface_advance;
interface Bank{
	void display();
	interface BankLocker{
		void print();
	}
}
class HDFC implements Bank, Bank.BankLocker{

	@Override
	public void display() {
		System.out.println("in dispaly method which is present in Bank interface");
	}

	@Override
	public void print() {
		System.out.println("in print method which is present in inner interface");
	}
}
public class BankInterfaceMain {
	public static void main(String[] args) {
		HDFC h1 = new HDFC();
		h1.display();
		h1.print();
	}
}
