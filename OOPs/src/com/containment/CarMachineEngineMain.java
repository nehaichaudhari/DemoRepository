package com.containment;

class Engine {
	private String engineType;
	private int price;

	Engine() {

	}

	Engine(String engineType, int price) {
		this.engineType = engineType;
		this.price = price;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
	
	/*public String toString() {
		return "\nEngine details: "+"\nengine type: "+engineType+"\nprice is: "+price;
	}*/
}

class Machine {
	private String machineType;
	private Engine e;

	Machine() {

	}

	Machine(String machineType, Engine e) {
		this.machineType = machineType;
		this.e = e;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getMachineType() {
		return machineType;
	}

	public void setEngine(Engine e) {
		this.e = e;
	}

	public Engine getEngine() {
		return e;
	}
	
	/*public String toString() {
		return "\nMachine details:"+"\nmachine type: "+machineType+"\nEngine details: "+e;
	}*/
}

class Car {
	private int modelNo;
	private String carName;
	private Machine m;

	Car() {

	}

	Car(int modelNo, String carName, Machine m) {
		this.modelNo = modelNo;
		this.carName = carName;
		this.m = m;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setM(Machine m) {
		this.m = m;
	}

	public Machine getM() {
		return m;
	}

	/*public String toString() {
		return "\nmodel no: "+ modelNo + "\ncar name: " + carName + "\nMachine details " + m;
	}*/

}

public class CarMachineEngineMain {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setModelNo(101);
		c1.setCarName("baleno");
		c1.setM(new Machine());
		c1.getM().setMachineType("automatic machine");
		c1.getM().setEngine(new Engine());
		c1.getM().getEngine().setEngineType("diesel");
		c1.getM().getEngine().setPrice(2500);
		//System.out.println(c1);
		
		System.out.println("car details: \n"+c1.getModelNo());
		System.out.println(c1.getCarName());
		System.out.println("machine details:\n"+c1.getM().getMachineType());
		System.out.println("engine details:\n"+c1.getM().getEngine().getEngineType());
		System.out.println(c1.getM().getEngine().getPrice());
	}

}
