package com.mongodb.service;

import com.mongodb.entity.Student;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(String id);

    Student updateStudent(Student student);

    void deleteStudent(String id);
}
