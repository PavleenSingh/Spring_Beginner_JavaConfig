package com.springdemo.practiceactseven;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public FortuneService hardworkingFrotune()
	{
		return new HardworkingFortune();
	}
	
	@Bean
	public Coach wrestlingCoach()
	{
		return new WrestlingCoach(hardworkingFrotune());
	}
}
