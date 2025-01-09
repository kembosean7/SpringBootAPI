package com.example.demo;
import java.time.LocalDate;
import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Month;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return  List.of(
				new Student(1L, "Sean", "kembosean7@gmail.com", LocalDate.of(2004, Month.APRIL, 5), 21));
	}

}