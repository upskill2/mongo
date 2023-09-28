package com.mongodb;

import com.mongodb.entity.collections.DepartmentCollection;
import com.mongodb.entity.collections.StudentCollection;
import com.mongodb.entity.collections.SubjectCollection;
import com.mongodb.repository.collections.DepartmentRepository;
import com.mongodb.repository.collections.StudentCollectionRepository;
import com.mongodb.repository.collections.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories ("com.mongodb.repository")
@EntityScan ("com.mongodb.*")
public class MongodbApplication implements CommandLineRunner {

    @Autowired
    private StudentCollectionRepository repository;
    @Autowired
    private DepartmentRepository dptRepository;
    @Autowired
    private SubjectRepository subjectRepository;

    public static void main (String[] args) {
        SpringApplication.run (MongodbApplication.class, args);
    }

    @Override
    public void run (final String... args) throws Exception {

        DepartmentCollection departmentCollection =
                new DepartmentCollection ("Computer Science", "New York");
        dptRepository.save (departmentCollection);

        List<SubjectCollection> subjectCollection1 = List.of (
                new SubjectCollection ("Java", 100));
        subjectRepository.save (subjectCollection1.get (0));


        StudentCollection studentCollection1 =
                new StudentCollection ("John", "@gmail.com", departmentCollection, subjectCollection1);

        repository.save (studentCollection1);

    }
}
