package com.telusko;

import com.telusko.entity.Student;
import com.telusko.service.IStudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CrudRepositoryApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext container = SpringApplication.run(CrudRepositoryApplication.class, args);
		Student student = new Student("Shivsharn " , 23 , "Noida");
		IStudentService service = container.getBean(IStudentService.class);
		System.out.println(service.saveStudent(student));


	}

}
