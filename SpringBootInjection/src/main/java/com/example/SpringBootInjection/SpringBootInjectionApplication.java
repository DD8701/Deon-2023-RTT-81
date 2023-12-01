package com.example.SpringBootInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringBootInjection.myServices.Coach;

@SpringBootApplication(scanBasePackages = {"com.example.SpringBootInjection.myServices"})
public class SpringBootInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
		SpringApplication.run(SpringBootInjectionApplication.class, args);
		
		//get the bean from the spring container
		Coach theCoach = context.getBean(Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
