package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e1 = context.getBean("emp1",Employee.class);
		System.out.println("Employee Details: "+e1);
	}

}
