package com.constructor;

class Item {
	private int id;
	private String name;
	private float price;
	
	Item(){
		
	}
	
	Item(int id, String name,float price){
		this.id=id;
		this.name=name;
		this.price = price;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String toString() {
		return id+" "+name+" "+price;
	}

}

public class GrosaryShop {
	static void giveDiscount(Item i){
		if(i.getPrice()>200) {
			float p = i.getPrice();
			p=(p-(0.1f)*p);
			i.setPrice(p);
		}
	}
	
	public static void main(String[] args) {
		
		Item i1 = new Item(1,"sugar",650);
		Item i2 = new Item(2,"flour",60);
		Item i3 = new Item(3,"coffee",550);
		Item i4 = new Item(4,"red label",150);
		Item i5 = new Item(5,"jagary",700);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
		giveDiscount(i1);
		giveDiscount(i2);
		giveDiscount(i3);
		giveDiscount(i4);
		giveDiscount(i5);
		
		System.out.println("After give discount:");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		
	}
	
}
