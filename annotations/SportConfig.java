package com.springdemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:myclass.properties")
//@ComponentScan("com.springdemo.annotations")  // optional
public class SportConfig {
	
	// Registering bean for lucky fortune service
	// Remember method name is Bean ID
	@Bean
	public FortuneService luckyFortuneService()
	{
		return new LuckyFortuneService();
	}
	
	// Registering bean from Swim Coach
	@Bean
	public Coach swimCoach()
	{
		SwimCoach swim=new SwimCoach(luckyFortuneService()); //construct DI
		return swim;
	}
}
