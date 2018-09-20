package com.ujjawal.spring.springCore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/map/mapconfig.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer.getId());
		System.out.println(customer.getProducts());
//		Check the type of list being created by Spring -- ArrayList
		System.out.println(customer.getProducts().getClass());
	}

}
