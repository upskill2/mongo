package com.mongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Subject {

    @Field(name = "subjectName")
    private String subjectName;

    @Field(name = "marks_obt")
    private int marksObtained;
}
