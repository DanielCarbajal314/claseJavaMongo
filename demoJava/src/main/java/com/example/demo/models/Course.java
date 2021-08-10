package com.example.demo.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Course {
    @Id
    public String id;
    @Field
    public String name;
    @Field
    public String teachersName;
    @Field
    public ArrayList<String> StudentIds;
}
