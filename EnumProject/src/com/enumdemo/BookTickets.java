package com.enumdemo;

import java.util.Scanner;

public class BookTickets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the ticket type: ");
		System.out.println("1.Standare");
		System.out.println("2.Premium");
		System.out.println("3.Recliner");
		
		int seatType = sc.nextInt();
		System.out.println("enter no of seats: ");
		
		int num = sc.nextInt();
		MovieSeats ms=null;
		switch(seatType) {
		case 1: ms=MovieSeats.STANDARD;
		break;
		case 2:ms=MovieSeats.PREMIUM;
		break;
		case 3: ms=MovieSeats.RECLINER;
		break;
		default: System.out.println("error");
		}
		System.out.println("Ticket type: "+ms);
		System.out.println("No of tickets: "+num);
		System.out.println("total amount: "+(num*(ms.price)));
		sc.close();
	}

}
