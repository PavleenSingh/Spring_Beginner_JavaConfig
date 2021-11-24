package com.springdemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationMainApp {

	public static void main(String[] args) {
		
		
		/*//using XML
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("./applicationContext.xml");
		*/
		
		// using java code config instead of XML
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		//Coach c=context.getBean("tennisCoach",Coach.class);
		Coach c=context.getBean("swimCoach",Coach.class);
		
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		
		context.close();
	}

}
