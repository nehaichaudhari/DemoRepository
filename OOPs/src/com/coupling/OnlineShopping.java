package com.coupling;
interface Payment{
	public void doTransaction(double amount);
}
class CreditCard implements Payment{
	private int cardNo;
	private int cvv;
	private double limit;
	
	CreditCard(){
		
	}
	
	CreditCard(int cardNo, int cvv, double limit){
		super();
		this.cardNo=cardNo;
		this.cvv=cvv;
		this.limit=limit;
	}

	public int getCardNo() {
		return cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public double getLimit() {
		return limit;
	}
	
	public void setLimit(double limit) {
		this.limit=limit;
	}

	@Override
	public void doTransaction(double amount) {
		if((this.limit-amount)>0) {
			System.out.println("credit card is debited by: "+amount);
			this.limit=amount;
		}else {
			System.out.println("insuficient balance");
		}
	}
}
class DebitCard implements Payment{
	private int cardNo;
	private double balance;
	
	DebitCard(){
		
	}
	
	DebitCard(int cardNo, double balance){
		super();
		this.cardNo=cardNo;
		this.balance=balance;
	}
	
	@Override
	public void doTransaction(double amount) {
		if((this.balance-amount)>1000) {
			System.out.println("amount is debited through debit card of: "+amount);
			this.balance=amount;
		}else {
			System.out.println("insuficient balance");
		}
	}
}
public class OnlineShopping {
	String name;
	long moNo;
	OnlineShopping(){
		super();
	}
	OnlineShopping(String name, long moNo){
		this.name=name;
		this.moNo=moNo;
	}
	
	public void payBills(CreditCard c, float amt) {
		c.doTransaction(amt);
	}
	public void payBills(Payment p, float amt, float dis) {
		amt = amt-((dis/100)*amt);
		p.doTransaction(amt);
	}
	public static void main(String[] args) {
		OnlineShopping o = new OnlineShopping("harshada", 9563546525l);
		
		CreditCard c1 = new CreditCard(5465124, 633, 50000);
		o.payBills(c1, 40000);
		
		DebitCard d1 = new DebitCard(1254652, 70000);
		o.payBills(d1, 3000, 10);
		
	}

}
