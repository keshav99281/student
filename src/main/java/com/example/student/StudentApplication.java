package com.example.student;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(StudentApplication.class, args);

		StudentRepository studentRepository = context.getBean(StudentRepository.class);
		List<Student> name = studentRepository.findByName("keshav");
		name.forEach(e ->System.out.println(e) );

		List<Student> address = studentRepository.findByAddress("sitabari");
		address.forEach(e ->System.out.println(e) );


	}
}
