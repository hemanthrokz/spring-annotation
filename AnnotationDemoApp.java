package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context=
							new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
 Coach thecoach=context.getBean("tennisCoach", Coach.class);
 
 
 System.out.println(thecoach.getDailyWorkout());
 System.out.println(thecoach.getFortuneService());
 
 context.close();
	}

}
