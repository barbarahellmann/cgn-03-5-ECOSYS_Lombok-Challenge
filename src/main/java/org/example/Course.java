package org.example;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Course {
    int id;
    String name;
    String teacher;
    String students;

}
