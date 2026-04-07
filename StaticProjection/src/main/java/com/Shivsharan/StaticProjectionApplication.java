package com.Shivsharan;

import com.Shivsharan.service.IproductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StaticProjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(StaticProjectionApplication.class, args);
		IproductService service = container.getBean(IproductService.class);
		service.searchByPPriceLessThan(5000.0).forEach(p-> System.out.println(p.getpName() + p.getPquantity()));


	}

}
