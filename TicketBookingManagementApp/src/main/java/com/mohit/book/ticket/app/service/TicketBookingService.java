package com.mohit.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.book.ticket.app.dao.TicketBookingDao;
import com.mohit.book.ticket.app.entities.Ticket;

@Service //
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	public Ticket createTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return null;
	}

}
