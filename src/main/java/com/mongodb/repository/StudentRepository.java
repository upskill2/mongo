package com.mongodb.repository;

import com.mongodb.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findAllByName (String name);

    List<Student> findAllByNameAndEmail (String name, String email);

    List<Student> findAllByNameOrEmail (String name, String email);

    List<Student> findAllByOrderByNameAsc ();

    List<Student> findAllByDepartmentDepartmentName (String departmentName);

    List<Student> findAllBySubjectsSubjectName (String subjectName);

    List<Student> findAllByEmailLike (String email);

    List<Student> findAllByNameStartsWith (String name);
}
