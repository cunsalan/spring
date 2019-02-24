package com.unsalan.sprindemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring conf file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");	
		// retrieve bean from spring container
		Coach myCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean result = myCoach == alphaCoach;
		
		System.out.println("\n Pointing to the same object " + result);
		
		System.out.println("\n Memory location for the myCoch" + myCoach);
		
		System.out.println("\n Memory location for the myCoch" + alphaCoach+"\n");
		
		context.close();
		
		
		
	}

}
