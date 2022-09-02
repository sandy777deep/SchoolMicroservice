package com.example.School.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.School.pojo.Course;
import com.example.School.pojo.School;
import com.example.School.pojo.Student;
@RestController
@RequestMapping("/School")
public class Microservices {
	
	@Autowired
	private WebClient.Builder webclientBuilder;

	
	@GetMapping("/details/{id}")
	private School getCourseandStudent(@PathVariable Long id) {
		
		Student stuObj= webclientBuilder.build()
				.get()
				.uri("http://localhost:8081/student/getOneById/"+id)
				.retrieve()
				.bodyToMono(Student.class)
				.block();
		Course cObj=webclientBuilder.build()
				.get()
				.uri("http://localhost:8088/course/getCourse/"+id)
				.retrieve()
				.bodyToMono(Course.class)
				.block();
		
		
		return new School(stuObj, cObj);
		
		
				
	}
	
	
	
	
	
	
}
