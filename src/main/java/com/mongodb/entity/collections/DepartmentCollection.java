package com.mongodb.entity.collections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@ToString
@Document (collection = "department")
public class DepartmentCollection {

    @Id
    private String id;

    @Field(name = "departmentName")
    private String departmentName;

    @Field(name = "location")
    private String location;

    public DepartmentCollection (final String departmentName, final String location) {
        this.departmentName = departmentName;
        this.location = location;
    }
}
