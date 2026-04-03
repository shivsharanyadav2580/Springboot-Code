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

//		System.out.println(service.serachProductById(102));


//	 	service.searchProductsByIds(ids).forEach(p -> System.out.println(p));

//		System.out.println(service.serachByProductsDetails(new Product("Rice" , "Grocery" , 2000.0 , 20)));
		List<Integer> ids = Arrays.asList( 115 , 116 , 120);
//		String status = service.deleteProductsByidCrud(ids);
		String status = service.deleteProdutsByIdJpa(ids);

	}


}
