package com.springdemo.practiceactsix;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {

	@Value("${foo.wheels}")
	private String totalWheels;
	
	@Value("${foo.model}")
	private String model;
	
	@PostConstruct
	public void doingCleanupProcess()
	{
		System.out.println("Cleaming of ------------"+model+" --------is successfull");
	}
	
	@Override
	public String getTotalWheels() {
		// TODO Auto-generated method stub
		return totalWheels+ " the brand of my car is "+model;
	}
	
	
}
