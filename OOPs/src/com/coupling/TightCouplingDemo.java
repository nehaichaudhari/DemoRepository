package com.coupling;
interface MessageS{
	void sendMessage(String msg);
}
class Whatsapp implements MessageS{
	String type;
	@Override
	public void sendMessage(String msg) {
		this.type="Whatsapp";
		System.out.println(type+" "+msg);
	}
}
class Telegram implements MessageS{
	String type;
	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+" "+msg);
	}
}
public class TightCouplingDemo {
		public void messageType(Whatsapp w) {
			w.sendMessage("Welcome");
		}
		public static void main(String[] args) {
			TightCouplingDemo obj = new TightCouplingDemo();
			Whatsapp w1 = new Whatsapp();
			obj.messageType(w1);
			
			Telegram t1 = new Telegram();
			//obj.messageType(t1); this not possible in tight coupling because it tightly coupled with whatsapp
		}
}
