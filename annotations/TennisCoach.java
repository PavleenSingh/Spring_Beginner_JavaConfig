package com.springdemo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
@Scope("singleton")
public class TennisCoach implements Coach {
	
	// using field injection
	/*
	@Autowired
	private FortuneService fortuneService;
	*/
	
	private FortuneService fortuneService;
	
	// using Constructor for DI
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService=fortuneService;
	}
	*/
	
	// using Setter for DI
	// start
	public TennisCoach()
	{
		System.out.println("Constructor working fine");
	}
	
	
	@Autowired
	@Qualifier("sadFortuneService")
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("Inside setFortuneService");
		this.fortuneService=fortuneService;
	}// END
	
	
	/*
	// using any method name instead of setter
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService)
	{
		System.out.println("inside doSomeCrazyStuff");
		this.fortuneService=fortuneService;
	}// END
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	@PostConstruct
	public void doStartupStuff()
	{
		System.out.println("Init phase of a bean");
	}
	@PreDestroy
	public void doCleanupStuff()
	{
		System.out.println("Destroy phase of a bean");
	}

}
