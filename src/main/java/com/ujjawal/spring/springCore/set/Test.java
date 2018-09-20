package com.ujjawal.spring.springCore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/set/setconfig.xml");
		CarDealer cardealer = (CarDealer) context.getBean("cardealer");
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		// Check the type of list being created by Spring -- ArrayList
		System.out.println(cardealer.getModels().getClass());
	}

}
