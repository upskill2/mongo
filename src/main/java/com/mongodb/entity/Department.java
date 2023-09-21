package com.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
public class Department {

    @Field(name = "departmentName")
    private String departmentName;

    @Field(name = "location")
    private String location;
}
