package com.example.demo;

import java.util.ArrayList;

import com.example.demo.models.Course;
import com.example.demo.models.Person;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.PersonRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, CourseRepository courseRepository, MongoTemplate mongoTemplate) {
		return (args) -> {
			// personRepository.save(new Person("Luis","Carbajal",31));
			// System.out.println("Una persona ha sido registarda");
			// var course = new Course();
			// course.name = "Lenguaje De Programacion 2";
			// course.teachersName = "Claudia Zapata";
			// course.StudentIds = new ArrayList<>();
			// course.StudentIds.add("6111bd3bf43eda7051c9d75d");
			// course.StudentIds.add("6111c069ec1798610deb860e");
			// course.StudentIds.add("6111c1650f6adf5d271fd27b");
			// courseRepository.save(course);
			// var people = personRepository.findByFirstName("Daniel");
			

			var query = new Query();
			query.addCriteria(
				new Criteria("age").gte(20).lt(100)
			)
			.fields()
				.include("firstName")
				.include("lastName")
				.exclude("id");
			var people = mongoTemplate.find(query, Person.class);
			people.stream().forEach(person -> System.out.println(person));

		};
	}
}
