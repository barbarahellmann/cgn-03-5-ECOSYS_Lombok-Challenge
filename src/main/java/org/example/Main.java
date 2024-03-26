/**
 * Step 1: Add the Lombok dependency to your project and configure IntelliJ to support Lombok.
 * Step 2: Create a simple class "Student" with the following attributes: id, name, address, grade.
 * Step 2.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
 * Step 3: Create a Teacher record with the following attributes: id, name, subject.
 * Step 4: Create a class Course with the following attributes: id, name, teacher, students.
 * Step 4.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
 * Step 5: Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
 * Step 6: In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...).
 */

package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(2233, "Paul", "Cologne", 1);
        Student student2 = new Student(3344, "Chrissy", "Heidelberg", 1);
        Student student3 = new Student(4455, "Silvia", "Götttingen", 1);


        Teacher teacher1 = new Teacher(1, "Dominic", "Java Sandbox");
        Teacher teacher2 = new Teacher(2, "Florian", "OOP");
        Teacher teacher3 = new Teacher(3, "Raffael", "Java Ecosystem");


        Course course = new Course(12, "Java Bootcamp", teacher1, List.of(student1, student2));
    }
}