package com.ujjawal.spring.springCore.lc.ticketReservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/lc/ticketReservation/lcticketReservationconfig.xml");
		TicketReservation ticketreservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketreservation);
		context.registerShutdownHook();

	}

}
