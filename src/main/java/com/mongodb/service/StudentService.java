package com.mongodb.service;

import com.mongodb.entity.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents(Long pageNumber);

    Student getStudentById(String id);

    Student updateStudent(Student student);

    void deleteStudent(String id);

    List<Student> getStudentsByName (String name);

    List<Student> getStudentsByNameAndEmail (String name, String email);

    List<Student> getStudentsByNameOrEmail (String name, String email);

    List<Student> getAllSorted ();

    List<Student> getByDepartmentName (String departmentName);

    List<Student> getBySubjectName (String subjectName);

    List<Student> getByEmailLike (String email);

    List<Student> getStudentsnameStartsWith (String name);

    List<Student> getByNameNative (String id);
}
