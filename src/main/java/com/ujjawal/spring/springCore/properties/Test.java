package com.ujjawal.spring.springCore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/properties/propertiesconfig.xml");
		CountriesandLanguages countriesandlangs = (CountriesandLanguages) context.getBean("countriesandlangs");
		System.out.println(countriesandlangs.getCountryandLangs());
//		Check the type of list being created by Spring -- ArrayList
		System.out.println(countriesandlangs.getCountryandLangs().getClass());
	}

}
