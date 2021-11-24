package com.springdemo.practiceactseven;

public class WrestlingCoach implements Coach {

	private FortuneService fortuneService;
	
	public WrestlingCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String nameOfCoach() {
		// TODO Auto-generated method stub
		return "Rakesh Singh";
	}

	@Override
	public String sportOfCoach() {
		// TODO Auto-generated method stub
		return "Wrestling Coach for team";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
