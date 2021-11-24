package com.springdemo.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "HAPPY FORTUNE :) :) yaayay!!!!!!";
	}

}
