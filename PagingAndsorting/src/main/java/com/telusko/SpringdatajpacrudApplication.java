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
//		service.fetchProductInfoBySorting(true , "pPrice")
//				.forEach(p-> System.out.println(p));
service.fetchPageByPagination(6);


	}


}
