package com.ujjawal.spring.springCore.lc.ticketReservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	@Override
	public String toString() {
		return "TicketReservation [id=" + id + "]";
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter");
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("Inside initialize()");
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Inside cleanUp()");
	}

}
