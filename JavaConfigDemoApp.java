package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		
		
		AnnotationConfigApplicationContext context=
							new AnnotationConfigApplicationContext("SportConfig.class");
		
		
 Coach thecoach=context.getBean("tennisCoach", Coach.class);
 
 
 System.out.println(thecoach.getDailyWorkout());
 System.out.println(thecoach.getFortuneService());
 
 context.close();
	}

}
