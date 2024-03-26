package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;


@Data // Generates getter, setter, ...
@NoArgsConstructor // Generates a no-args constructor
@AllArgsConstructor // Generates an all-args constructor


public class Student {

    int id;
    String name;
    String adress;
    int grade;

}
