package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	//CommandLineRunner is a simple Spring Boot interface with a run method. Spring Boot will automatically call the run method of all beans implementing this interface after the application context has been loaded.
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student emre = new Student("Emre","yemre@uzun.com",LocalDate.of(1992, 1, 1));
			Student ali = new Student("Ali","ali@ali.com",LocalDate.of(1998, 1, 1));
			repository.saveAll(List.of(emre, ali));
		};
	}
}
