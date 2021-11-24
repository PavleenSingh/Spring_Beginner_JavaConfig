package com.springdemo.practiceactsix;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("./applicationContext.xml");
		Vehicle v=context.getBean("car",Vehicle.class);
		
		System.out.println(v.getTotalWheels());
		
		context.close();
	}

}
