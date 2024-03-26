package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Data // Generates getter, setter, ...
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates an all-args constructor


public class Course {
    int id;
    String name;
    String teacher;
    String students;

}
