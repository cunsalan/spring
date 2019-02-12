/**
 * 
 */
package com.unsalan.sprindemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author can
 *
 */
public class HelloSpringApp {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// load the spring configuration file		
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach theCoach = context.getBean("myCoach",Coach.class);
			//retrive bean from spring container
			System.out.println(theCoach.getWorkOut());
			System.out.println(theCoach.getDailyFortune());
			//call methods on the bean		
			context.close();
			Thread.sleep(1000);			
		//close the contect

	}

}
