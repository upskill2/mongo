package com.mongodb.entity.collections;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@Document(collection = "subject")
public class SubjectCollection {

    @Id
    private String id;

    @Field(name = "subjectName")
    private String subjectName;

    @Field(name = "marks_obt")
    private int marksObtained;

    public SubjectCollection (final String subjectName, final int marksObtained) {
        this.subjectName = subjectName;
        this.marksObtained = marksObtained;
    }
}
