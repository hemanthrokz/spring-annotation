package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
//	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside set method c");
//
//		this.fortuneService = fortuneService;
//	}


	
//public TennisCoach(FortuneService fortuneService) {
//		System.out.println("inside constructor");
//	this.fortuneService = fortuneService;
//	}


	@Override
	public String getDailyWorkout() {
		
		return "this is tenniscoach speaking";
	}

	@Override
	public String getFortuneService() {
		
		return fortuneService.getFortune();
	}

	

}
