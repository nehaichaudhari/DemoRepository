package com.interface_advance;

interface Mobile1{
	default void print() {
		System.out.println("print method in interface mobile");
	}
}
interface Samsung1 extends Mobile1{
	default void print() {
		Mobile1.super.print();
		System.out.println("print method in interface samsung");
	}
}
interface Vivo1 extends Mobile1{
	default void print() {
		System.out.println("print method in interface vivo");
	}
}
class Demo1 implements Samsung1, Vivo1{
	public void print(){
		
		Samsung1.super.print();
		Vivo1.super.print();
	}
}
public class DaimondProbDemo1 {
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.print();
	}

}
