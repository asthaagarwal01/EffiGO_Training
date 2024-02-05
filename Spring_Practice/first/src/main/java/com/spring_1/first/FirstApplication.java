package com.spring_1.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(FirstApplication.class, args);
		//System.out.println("Hello World");
		
		Person ob=context.getBean(Person.class);
		ob.show();
		
		
	}

}
