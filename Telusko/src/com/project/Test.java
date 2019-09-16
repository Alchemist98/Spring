package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("dependcyinject.xml");
		
		Car obj = (Car)context.getBean("car");
		obj.drive();
		
		//Tyre t = (Tyre)context.getBean("tyre");
		//System.out.println(t);
	}

}
