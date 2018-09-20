package com.ujjawal.spring.springCore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/reftypes/reftypesconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
	}

}
