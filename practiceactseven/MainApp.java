package com.springdemo.practiceactseven;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Coach c=context.getBean("wrestlingCoach",Coach.class);
		
		System.out.println("Wrestling coach name is "+c.nameOfCoach());
		System.out.println("He is the "+c.sportOfCoach());
		System.out.println("The fortune of team says that "+c.getDailyFortune());
		
		context.close();
		
	}

}
