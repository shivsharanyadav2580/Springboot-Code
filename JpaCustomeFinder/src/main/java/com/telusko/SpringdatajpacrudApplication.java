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
//		System.out.println(service.searchByPrice(60000.0));
//		System.out.println(service.searchByPriceIs(60000.0));
//		service.gitanjaliBypPriceGreaterThan(2000.0).forEach(p-> System.out.println(p));
//		System.out.println("****************");
//		System.out.println(service.searchBypriceLessThan(2000.0));
//		service.searchBypPriceBetween(2000.0 , 60000.0).forEach(p-> System.out.println(p));
//		service.searchBypCategory("Grocery").forEach(p-> System.out.println(p));

		List<String> categories = Arrays.asList("Electronics");
		service.searchBypCategoryInAndpPriceBetween(categories , 5000.0 , 60000.0).forEach(p-> System.out.println(p));

	}


}
