package com.mongodb.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@ToString
@Document(collection = "student")
@NoArgsConstructor
public class Student {

    @Id
    private String id;

    @Field(name = "name")
    private String name;

    @Field(name = "mail")
    private String email;

    @Field(name = "department")
    private Department department;

    @Field(name = "subjects")
    private List<Subject> subjects;

    public Student(String name, String email, Department department, List<Subject> subjects) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }

    public Student(String id, String name, String email, Department department, List<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }

    public Student(String name) {
        this.name = name;
    }
}
