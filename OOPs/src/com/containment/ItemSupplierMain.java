package com.containment;

public class ItemSupplierMain {
	static void findSupplierName(Supplier s) {
		if(s.getItem().getPrice()==50) {
			System.out.println("Supplier name is: "+s.getSname());
		}
	}
	public static void main(String[] args) {
		Supplier s1 = new Supplier();
		s1.setSid(101);
		s1.setSname("john");
		s1.setItem(new Item());
		s1.getItem().setId(1);
		s1.getItem().setName("soap");
		s1.getItem().setPrice(50);
		
		Supplier s2 = new Supplier();
		s2.setSid(102);
		s2.setSname("ram");
		s2.setItem(new Item());
		s2.getItem().setId(2);
		s2.getItem().setName("biscuit");
		s2.getItem().setPrice(50);
		
		Supplier s3 = new Supplier();
		s3.setSid(103);
		s3.setSname("munna");
		s3.setItem(new Item());
		s3.getItem().setId(3);
		s3.getItem().setName("colgate");
		s3.getItem().setPrice(150);
		
		Supplier s4 = new Supplier();
		s4.setSid(104);
		s4.setSname("ronak");
		s4.setItem(new Item());
		s4.getItem().setId(4);
		s4.getItem().setName("jewellery");
		s4.getItem().setPrice(350);
		
		findSupplierName(s1);
		findSupplierName(s2);
		findSupplierName(s3);
		findSupplierName(s4);
		
	}
}
