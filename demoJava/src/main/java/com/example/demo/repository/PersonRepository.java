package com.example.demo.repository;

import java.util.List;

import com.example.demo.models.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    public List<Person> findByFirstName(String firstName);
}
