package com.covariant;
class Person2{
	int id;
	String name;
	float bal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
}
class Paytm{
	static Person2 diaplay() {
		Person2 p=new Person2();
		p.setId(101);
		p.setName("radha");
		p.setBal(20000);
		return p;
	}
}
public class PerEmpBankMain {
	public static void main(String[] args) {
	Person2 p1 = Paytm.diaplay();
	float balance = p1.getBal()-2000;
	System.out.println("id is: "+p1.getId()+"\nname is: "+p1.getName()+"\nsalary is: "+p1.getBal());
	p1.setBal(balance);
	System.out.println("available balance is: "+p1.getBal());
	}
}
