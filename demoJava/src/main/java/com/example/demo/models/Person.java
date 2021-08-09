package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Person {
    @Id
    public String id;
    @Field
    public String firstName;
    @Field
    public String lastName;
    @Field
    public int age;

    public Person() {}

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return 
        String.format(
            """
                id : %s,
                firstName: %s,
                lastName: %s,
                age: %d
            """,
            this.id,
            this.firstName,
            this.lastName,
            this.age
        );
    }    
}
