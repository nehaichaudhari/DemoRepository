package com.interface_examples;
interface TaxPay{
	String cname="India";
	void taxamount();
}
class Celebrity implements TaxPay{
	String celebName;
	float income;
	
	Celebrity(){
		
	}
	
	Celebrity(String celebName, float income){
		super();
		this.celebName=celebName;
		this.income=income;
	}
	@Override
	public void taxamount() {
		System.out.println("celebrity amount of tax: "+(0.2*income));
	}	
}
class Employee implements TaxPay{
	String empName;
	float salaty;
	
	Employee() {

	}
	
	Employee(String empName, float salary){
		super();
		this.empName=empName;
		this.salaty=salary;
	}

	@Override
	public void taxamount() {
		if(salaty>500000) {
		System.out.println("employee amount of tax: "+(0.1*salaty));
		}else {
			System.out.println("your salary is tax free");
		}
	}
}
public class InterfaceDemo1 {
	public static void main(String[] args) {
		Celebrity c= new Celebrity("Amitabh",900000);
		c.taxamount();
		
		Employee e = new Employee("Gauri", 650000);
		e.taxamount();
	}

}
