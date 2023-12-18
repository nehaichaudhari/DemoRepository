package com.treemap;

import java.util.Map;
import java.util.TreeMap;

public class CustomerOrderTreeMap {
	public static void main(String[] args) {
		TreeMap<Customer, Order> tmap = new TreeMap<>(new MnoComparator());
		tmap.put(new Customer(1, "madhu", 9685367569L), new Order(101, "laptop", 45000));
		tmap.put(new Customer(6, "nilam", 2368954675L), new Order(102, "pendrive", 1000));
		tmap.put(new Customer(3, "harshada", 8965735695L), new Order(103, "hardisk", 6300));
		tmap.put(new Customer(4, "shivani", 5698326930L), new Order(104, "mobile", 23000));
		tmap.put(new Customer(5, "gauri", 4578628643L), new Order(105, "charger", 670));
		tmap.put(new Customer(2, "shraddha", 8569325698L), new Order(106, "headphones", 72000));
		
		for(Map.Entry<Customer, Order> e:tmap.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------");
		}
	}

}
