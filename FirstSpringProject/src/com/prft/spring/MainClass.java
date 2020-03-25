package com.prft.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Market mar=context.getBean("market",Market.class);
		mar.ingredients();
		mar.price();
	}

}
