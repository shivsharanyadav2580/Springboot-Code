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

//		Product pd1 = new Product("Laptop" , "Electronics" , 75000.0 , 10);
//
//
//		System.out.println(service.saveproduct(pd1));
//
//		List<Product> products = new ArrayList<>();
//		products.add(new Product("Laptop", "Electronics", 60000.0, 8));
//		products.add(new Product("Headphones", "Electronics", 2000.0, 25));
//		products.add(new Product("Smart Watch", "Electronics", 5000.0, 15));
//		products.add(new Product("Television", "Electronics", 45000.0, 6));
//		products.add(new Product("Refrigerator", "Appliances", 30000.0, 4));
//
//		products.add(new Product("Rice", "Grocery", 2000.0, 20));
//		products.add(new Product("Wheat Flour", "Grocery", 1500.0, 18));
//		products.add(new Product("Sugar", "Grocery", 800.0, 30));
//		products.add(new Product("Salt", "Grocery", 300.0, 40));
//		products.add(new Product("Milk", "Dairy", 60.0, 50));
//
//		products.add(new Product("Butter", "Dairy", 250.0, 35));
//		products.add(new Product("Cheese", "Dairy", 400.0, 22));
//		products.add(new Product("Shampoo", "Personal Care", 350.0, 28));
//		products.add(new Product("Soap", "Personal Care", 50.0, 60));
//		products.add(new Product("Toothpaste", "Personal Care", 120.0, 45));
//
//		products.add(new Product("Notebook", "Stationery", 80.0, 70));
//		products.add(new Product("Pen", "Stationery", 10.0, 100));
//		products.add(new Product("Chair", "Furniture", 1500.0, 10));
//		products.add(new Product("Table", "Furniture", 4000.0, 7));
//		products.add(new Product("Bed", "Furniture", 20000.0, 3));

//		service.saveMultipleProducts(products).forEach(p -> System.out.println(p));
//		service.getAllproducts().forEach(p -> System.out.println(p));
//		List<Integer> ids = Arrays.asList(2,3,1);
//		service.getAllProductsById(ids).forEach(p-> System.out.println(p));
//		System.out.println(service.getproductById(3));
//		System.out.println("total number of products " + service.getTotalProductCount());
//
//		Boolean status = service.isProductAvailable(3);
//		if(status){
//			System.out.println("product available");
//		}
//		else
//			System.out.println("product not available");

//		int id = 2;
//		System.out.println(service.deleteProductById(id));
		List<Integer> ids = Arrays.asList(52,53,121);
		service.deleteProductsByid(ids);

	}


}
