package com.finalkeyword;
class Bank{
	int bankId;
	final String bname="SBI";
	
	public Bank(int bankId) {
		this.bankId=bankId;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBname() {
		return bname;
	}
	
	void info() {
		System.out.println("\nbank id: "+bankId+"\bank name: "+bname);
	}
}
class Account extends Bank{
	int accNo;
	String accHolder;
	
	public Account(int bankId,int accNo, String accHolder) {
		super(bankId);
		this.accNo=accNo;
		this.accHolder=accHolder;
	}
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}

	void info() {
		System.out.println("\naccount no is: "+accNo+"\naccount holder name: "+accHolder);
	}
	
}
public class BankInfo {
	public static void main(String[] args) {
		Account a1 = new Account(1, 120245312, "ram");
		System.out.println(a1.getBankId());
		System.out.println(a1.getBname());
		System.out.println(a1.getAccNo());
		System.out.println(a1.getAccHolder());
		
	}
	
	

}
