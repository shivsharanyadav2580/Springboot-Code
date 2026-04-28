package com.telusko;

import com.telusko.service.Tshaped;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot3Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringBoot3Application.class, args);
		Tshaped tshaped = container.getBean(Tshaped.class);
		tshaped.
	}

}
