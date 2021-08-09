package com.example.demo.repository;

import com.example.demo.models.Person;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    
}
