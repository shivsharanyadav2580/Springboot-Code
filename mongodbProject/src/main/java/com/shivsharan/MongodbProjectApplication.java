package com.shivsharan;

import com.shivsharan.dto.CustomerDto;
import com.shivsharan.service.IStudentService;
import com.shivsharan.util.Idgenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MongodbProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(MongodbProjectApplication.class, args);
		IStudentService service = container.getBean(IStudentService.class);
		CustomerDto dto = new CustomerDto();

//		dto.setName("Priya");
//		dto.setAge(22);
//		dto.setCity("Sultanpur");
//		String id =  Idgenerator.generateId();
//		dto.setId(id);
//		String status = service.registerTheCourse(dto);
//		System.out.println(status);
//		service.findAllcx().forEach(c-> System.out.println(c));
		System.out.println(service.removeDocument("6ee4ac2d94"));
	}

}
