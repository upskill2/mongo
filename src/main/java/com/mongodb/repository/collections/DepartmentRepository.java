package com.mongodb.repository.collections;

import com.mongodb.entity.collections.DepartmentCollection;
import com.mongodb.entity.collections.StudentCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends MongoRepository<DepartmentCollection, String> {
}
