package com.interface_examples;

interface MessageService {
	void sendMessage();
}

class Whatapp implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("send message through whatsapp");
	}
}

class TextMessage implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("message send through text");
	}
}

class Telegram implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("message send through telegram");
	}
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		MessageService m;
		m = new Whatapp();
		m.sendMessage();

		m = new TextMessage();
		m.sendMessage();

		m = new Telegram();
		m.sendMessage();
	}

}
