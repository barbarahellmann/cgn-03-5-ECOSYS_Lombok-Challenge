package org.example;


import lombok.*;

import javax.xml.namespace.QName;
import java.util.List;

@Data // Generates getter, setter, ...
@AllArgsConstructor // Generates an all-args constructor
@Builder

public class Course {
    int id;
    @With
    private String name;
    // String name;
    String teacher;
    List<Student> students;

}
