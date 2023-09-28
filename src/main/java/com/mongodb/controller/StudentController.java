package com.mongodb.controller;

import com.mongodb.entity.Student;
import com.mongodb.entity.collections.StudentCollection;
import com.mongodb.service.collections.StudentCollectionService;
import com.mongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @Autowired
    StudentCollectionService studentCollectionService;

    @PostMapping ("/createCollection")
    public StudentCollection createStudentCollection (@RequestBody StudentCollection student) {
        return studentCollectionService.createStudent (student);
    }

    @GetMapping ("/getDepartmentById")
    public List<StudentCollection> getDepartmentCollection (@RequestParam String id) {
        return studentCollectionService.getDepartmentCollection (id);
    }

    @PostMapping ("/create")
    public Student createStudent (@RequestBody Student student) {
        return studentService.createStudent (student);
    }

    @GetMapping
    public List<Student> getStudent (@RequestParam (required = false) Long pageNumber) {
        return studentService.getAllStudents (pageNumber);
    }

    @GetMapping ("/{id}")
    public Student getStudentById (@PathVariable String id) {
        return studentService.getStudentById (id);
    }

    @PutMapping ("/update")
    public Student updateStudent (@RequestBody Student student) {
        return studentService.updateStudent (student);
    }

    @DeleteMapping ("/{id}")
    public void deleteStudent (@PathVariable String id) {
        studentService.deleteStudent (id);
    }

    @GetMapping ("/names/{name}")
    public List<Student> getStudentsByName (@PathVariable String name) {
        return studentService.getStudentsByName (name);
    }

    @GetMapping ("/byNameNative/{name}")
    public List<Student> getByNative (@PathVariable String name) {
        return studentService.getByNameNative (name);
    }

    @GetMapping ("/byNameAndEmail")
    public List<Student> getStudentsByNameAndEmail (@RequestParam String name, @RequestParam String email) {
        return studentService.getStudentsByNameAndEmail (name, email);
    }

    @GetMapping ("/byNameOrEmail")
    public List<Student> getStudentsByNameOrEmail (@RequestParam String name, @RequestParam String email) {
        return studentService.getStudentsByNameOrEmail (name, email);
    }

    @GetMapping ("/sorted")
    public List<Student> getAllSorted () {
        return studentService.getAllSorted ();
    }

    @GetMapping ("/byDepartmentName/{departmentName}")
    public List<Student> getByDepartmentName (@PathVariable String departmentName) {
        return studentService.getByDepartmentName (departmentName);
    }

    @GetMapping ("/bySubjectName/{subjectName}")
    public List<Student> getBySubjectName (@PathVariable String subjectName) {
        return studentService.getBySubjectName (subjectName);
    }

    @GetMapping ("/byEmailLike")
    public List<Student> getByEmailLike (@RequestParam String email) {
        return studentService.getByEmailLike (email);
    }

    @GetMapping ("/byNameStartsWith/{name}")
    public List<Student> getStudentsNameStartsWith (@PathVariable String name) {
        return studentService.getStudentsnameStartsWith (name);
    }

}
