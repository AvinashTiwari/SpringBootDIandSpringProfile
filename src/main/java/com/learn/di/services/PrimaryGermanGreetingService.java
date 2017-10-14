package com.learn.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary
public class PrimaryGermanGreetingService  implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "German Greeting Service";
	}

}
