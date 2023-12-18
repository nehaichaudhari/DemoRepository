package com.coupling;
interface MessageService{
	void sendMessage(String msg);
}
class Whatsapp1 implements MessageService{
	String type;
	@Override
	public void sendMessage(String msg) {
		this.type="Whatsapp";
		System.out.println(type+" "+msg);
	}
}
class Telegram1 implements MessageService{
	String type;
	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+" "+msg);
	}
}
public class LooseCouplingDemo {
		public void messageType(MessageService m) {
			m.sendMessage("wlcome");
		}
		public static void main(String[] args) {
			LooseCouplingDemo obj = new LooseCouplingDemo();
			Whatsapp1 w1 = new Whatsapp1();
			obj.messageType(w1);
			
			Telegram1 t1 = new Telegram1();
			obj.messageType(t1);
		}
}
