package com.mongodb.service;

import com.mongodb.entity.Student;
import com.mongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    public static final int SIZE = 3;
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student createStudent (Student student) {
        return studentRepository.save (student);
    }

    @Override
    public List<Student> getAllStudents (Long pageNumber) {
        if (pageNumber == null) {
            pageNumber = 1L;
        }
        Pageable pageable = PageRequest.of ((int) (pageNumber - 1), SIZE);
        return studentRepository.findAll (pageable).getContent ();
    }

    @Override
    public Student getStudentById (String id) {
        return Optional.of (studentRepository.findById (id)).get ().orElse (new Student ());
    }

    @Override
    public Student updateStudent (Student student) {
        return studentRepository.save (student);
    }

    @Override
    public void deleteStudent (String id) {
        studentRepository.deleteById (id);
    }

    @Override
    public List<Student> getStudentsByName (final String name) {
        return studentRepository.findAllByName (name);
    }

    @Override
    public List<Student> getStudentsByNameAndEmail (final String name, final String email) {
        return studentRepository.findAllByNameAndEmail (name, email);
    }

    @Override
    public List<Student> getStudentsByNameOrEmail (final String name, final String email) {
        return studentRepository.findAllByNameOrEmail (name, email);
    }

    @Override
    public List<Student> getAllSorted () {
        Sort sort = Sort.by (Sort.Direction.ASC, "name", "email");
        return studentRepository.findAll (sort);
    }

    @Override
    public List<Student> getByDepartmentName (final String departmentName) {
        return studentRepository.findAllByDepartmentDepartmentName (departmentName);
    }

    @Override
    public List<Student> getBySubjectName (final String subjectName) {
        return studentRepository.findAllBySubjectsSubjectName (subjectName);
    }

    @Override
    public List<Student> getByEmailLike (final String email) {
        return studentRepository.findAllByEmailLike (email);
    }

    @Override
    public List<Student> getStudentsnameStartsWith (final String name) {
        return studentRepository.findAllByNameStartsWith (name);
    }


}
