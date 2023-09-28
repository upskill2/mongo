package com.mongodb.service.collections;

import com.mongodb.entity.Student;
import com.mongodb.entity.collections.StudentCollection;
import com.mongodb.repository.collections.DepartmentRepository;
import com.mongodb.repository.collections.StudentCollectionRepository;
import com.mongodb.repository.collections.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCollectionServiceImpl implements StudentCollectionService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private StudentCollectionRepository studentCollectionRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public StudentCollection createStudent (final StudentCollection student) {

        if (student.getDepartment () != null) {
            departmentRepository.save (student.getDepartment ());
        }

        if (student.getSubjects () != null && !student.getSubjects ().isEmpty ()) {
            subjectRepository.saveAll (student.getSubjects ());
        }
        return studentCollectionRepository.save (student);
    }

    @Override
    public List<StudentCollection> getDepartmentCollection (final String id) {
        return studentCollectionRepository.findAllByDepartmentId (id);
    }
}
