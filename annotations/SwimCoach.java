package com.springdemo.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.wheels}")
	private String wheels;
	
	@Value("${foo.model}")
	private String model;
	
	public SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do backstrokes and fronstrokes without break :)" + wheels+model;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Swim Coach Fortune:"+fortuneService.getDailyFortune();
	}

}
