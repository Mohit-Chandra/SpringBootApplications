package com.mohit.book.ticket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mohit.book.ticket.app.entities.Ticket;
import com.mohit.book.ticket.app.service.TicketBookingService;

@RestController
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

}
