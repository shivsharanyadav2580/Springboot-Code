package com.telusko;

import com.telusko.entity.Product;
import com.telusko.service.IproductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdatajpacrudApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(SpringdatajpacrudApplication.class, args);
		IproductService service = container.getBean(IproductService.class);

////      service.findByCategory("Grocery").forEach(p-> System.out.println(p));
//
//		service.findByPPrice(350.0 , 60000.0).forEach(p-> System.out.println(p));
	int rowAffected = service.updateByPproductName(90000.0 , "Laptop");
		System.out.println(rowAffected);
	}

}
