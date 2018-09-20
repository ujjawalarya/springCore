package com.ujjawal.spring.springCore.lc.xmlconfig;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/lc/xmlconfig/lcxmlconfig.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		context.registerShutdownHook();
	}

}
