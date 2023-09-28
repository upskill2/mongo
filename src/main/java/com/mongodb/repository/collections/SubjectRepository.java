package com.mongodb.repository.collections;

import com.mongodb.entity.collections.SubjectCollection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends MongoRepository<SubjectCollection, String> {
}
