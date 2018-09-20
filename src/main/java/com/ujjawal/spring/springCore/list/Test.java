package com.ujjawal.spring.springCore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println(hospital.getName());
		System.out.println(hospital.getDepartments());
//		Check the type of list being created by Spring -- ArrayList
		System.out.println(hospital.getDepartments().getClass());
	}

}
