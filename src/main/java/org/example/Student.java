package org.example;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor

public class Student {

    int id;
    String name;
    String adress;
    int grade;

}
