package com.unsalan.sprindemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BenLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");		
		
		Coach myCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmailAdrress());	
		context.close();
	}

}
