package TicketsCalculations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int noofbookings, nooftickets;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Ticket tt = new Ticket();
		System.out.println("Enter the no of bookings:");
		noofbookings = sc.nextInt();
		System.out.println("Enter the available tickets:");
		if (Ticket.setAvaiableTickets(sc.nextInt()) == true) {
			return;
		}

		while (count < noofbookings) {
			System.out.println("Enter the ticketid:");
			tt.setTicketId(sc.nextInt());
			System.out.println("Enter the price:");
			tt.setPrice(sc.nextInt());
			System.out.println("Enter the no of tickets:");
			nooftickets = sc.nextInt();
			System.out.println("Available Tickets:" + Ticket.getAvailableTickets());
			System.out.println("Total amount:" + tt.calculateTicketCost(nooftickets));
			System.out.println("Available ticket after booking:" + Ticket.getAvailableTickets());

			count++;
		}

	}
}