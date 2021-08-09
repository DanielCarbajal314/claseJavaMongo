package com.example.demo;

import com.example.demo.models.Person;
import com.example.demo.repository.PersonRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository) {
		return (args) -> {
			personRepository.save(new Person("Daniel","Carbajal",31));
			System.out.println("Una persona ha sido registarda");
		};
	}
}
