package com.ujjawal.spring.springCore.shoppingCart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext is the parent interface of ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/ujjawal/spring/springCore/shoppingCart/shopcartconfig.xml");
		ShoppingCart shopcart = (ShoppingCart) context.getBean("shopcart");
		System.out.println(shopcart);
	}

}
