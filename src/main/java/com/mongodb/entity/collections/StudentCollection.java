package com.mongodb.entity.collections;

import com.mongodb.entity.Department;
import com.mongodb.entity.Subject;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Getter
@Setter
@ToString
@Document (collection = "student_collection")
@NoArgsConstructor
public class StudentCollection {

    @Id
    private String id;

    @Field (name = "name")
    private String name;

    @Field (name = "mail")
    private String email;

    @DBRef (lazy = false)
    private DepartmentCollection department;

    @DBRef (lazy = false)
    private List<SubjectCollection> subjects;

    @Transient
    private double average;

    public StudentCollection (final String name, final String email, final DepartmentCollection department, final List<SubjectCollection> subjects) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.subjects = subjects;
    }

    public double getAverage () {
        if (this.subjects != null && !this.subjects.isEmpty ()) {
            int total = 0;

            for (SubjectCollection subject : this.subjects) {
                total += subject.getMarksObtained ();
            }

            return (double) total / this.subjects.size ();
        }

        return 0.0;
    }
}
