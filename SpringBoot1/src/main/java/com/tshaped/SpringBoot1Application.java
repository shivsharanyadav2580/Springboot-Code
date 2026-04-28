package com.tshaped;

import com.tshaped.service.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot1Application.class, args);
//	   int count =  container.getBeanDefinitionCount();
//		System.out.println( "bean count is " + count)
		Greeting greet = container.getBean(Greeting.class);
		System.out.println(greet.generateWish());
	}

}
