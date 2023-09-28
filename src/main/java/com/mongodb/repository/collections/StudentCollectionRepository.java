package com.mongodb.repository.collections;

import com.mongodb.entity.Student;
import com.mongodb.entity.collections.StudentCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCollectionRepository extends MongoRepository<StudentCollection, String> {

    List<StudentCollection> findAllByName (String name);

    List<StudentCollection> findAllByNameAndEmail (String name, String email);

    List<StudentCollection> findAllByNameOrEmail (String name, String email);

    List<StudentCollection> findAllByOrderByNameAsc ();

    List<StudentCollection> findAllByDepartmentDepartmentName (String departmentName);

    List<StudentCollection> findAllBySubjectsSubjectName (String subjectName);

    List<StudentCollection> findAllByEmailLike (String email);

    List<StudentCollection> findAllByNameStartsWith (String name);

    List<StudentCollection> findAllByDepartmentId (String id);
}
