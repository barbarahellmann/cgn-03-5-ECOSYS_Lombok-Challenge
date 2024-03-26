package org.example;


import lombok.*;

@Data // Generates getter, setter, ...
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates an all-args constructor
@Builder
@With

public class Course {
    int id;
    String name;
    String teacher;
    String students;

}
