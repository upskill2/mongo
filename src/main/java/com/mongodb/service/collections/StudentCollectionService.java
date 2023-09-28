package com.mongodb.service.collections;

import com.mongodb.entity.Student;
import com.mongodb.entity.collections.StudentCollection;

import java.util.List;

public interface StudentCollectionService {

    public StudentCollection createStudent(StudentCollection student);

    List<StudentCollection> getDepartmentCollection (final String id);
}
