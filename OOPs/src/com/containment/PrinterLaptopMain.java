package com.containment;

public class PrinterLaptopMain {
	static void findLaptopName(Laptop l) {
		if(l.getPrinter().getPrice()>20000) {
			System.out.println("Laptop name is: "+l.getLname());
		}
	}
	public static void main(String[] args) {
		Printer p1 = new Printer(1, "HP", 25000);
		Printer p2 = new Printer(2, "canon", 20000);
		
		Laptop l1 = new Laptop(101, "HP", p1);
		Laptop l2 = new Laptop(102, "Acer", p2);
		Laptop l3 = new Laptop(103, "lenovo", p2);
		Laptop l4 = new Laptop(104, "dell", p1);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		
		//using getter setter
		Laptop l5=new Laptop();
		l5.setId(5);
		l5.setLname("fujistu");
		l5.setPrinter(new Printer());
		l5.getPrinter().setId(103);
		l5.getPrinter().setName("dell");
		l5.getPrinter().setPrice(15000);
		System.out.println(l5);
		
		System.out.println("------");
		System.out.println(l5.getId());
		System.out.println(l5.getLname());
		System.out.println(l5.getPrinter().getId());
		System.out.println(l5.getPrinter().getName());
		System.out.println(l5.getPrinter().getPrice());
		
		findLaptopName(l1);
	}

}
