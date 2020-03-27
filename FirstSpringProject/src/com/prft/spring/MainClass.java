package com.prft.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Vegetables veg=context.getBean("vegetables",Vegetables.class);
		veg.display();
		Fruits fr=context.getBean("fruits",Fruits.class);
		fr.displayinfo();
	}

}
