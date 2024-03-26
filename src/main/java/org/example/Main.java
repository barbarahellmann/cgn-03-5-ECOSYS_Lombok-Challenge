/**
 * Step 1: Add the Lombok dependency to your project and configure IntelliJ to support Lombok.
 * Step 2: Create a simple class "Student" with the following attributes: id, name, address, grade.
 * Step 2.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
 * Step 3: Create a Teacher record with the following attributes: id, name, subject.
 * Step 4: Create a class Course with the following attributes: id, name, teacher, students.
 * Step 4.5: Use the appropriate Lombok annotations to generate getters, setters, equals, hashCode, toString, and constructors for the entity.
 * Step 5: Write a "Main" class where you apply some examples of creating Students, Teachers, and Courses using the constructors.
 * Step 6: In the "Main" class, check if the generated Lombok methods work correctly (getter, setter, toString, ...).
 * Step 1: Add the Builder pattern to all entities and create additional objects with the Builder in the main method.
 * Step 2: Use the With annotation to facilitate changing properties.
 */

package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Student student1 = new Student(2233, "Paul", "Cologne", 1);
        Student student2 = new Student(3344, "Chrissy", "Heidelberg", 1);
        Student student3 = new Student(4455, "Silvia", "Götttingen", 1);


        Student student1 = Student.builder()
                .id(2233)
                .name("Paul")
                .address("Cologne")
                .grade(1)
                .build();

        // Teacher teacher1 = new Teacher(1, "Dominic", "Java");
        Teacher teacher2 = new Teacher(2, "Florian", "Development");
        Teacher teacher3 = new Teacher(3, "Raffael", "Programming");

        Teacher teacher1 = Teacher.builder()
                .id(1)
                .name("Dominic")
                .subject("Java")
                .build();


        // Course course1 = new Course(10, "Java Sandbox", teacher1.name(), List.of(student1, student2).toString());
        Course course2 = new Course(11, "Java OOP", teacher2.name(), List.of(student2, student3).toString());
        Course course3 = new Course(12, "Java Ecosystem", teacher3.name(), List.of(student1, student2, student3).toString());

        Course course1 = Course.builder()
                .id(10)
                .name("Java Sandbox")
                .teacher(teacher1.name())
                .students(List.of(student1, student2).toString())
                .build();


        System.out.println("Kursübersicht: ");
        System.out.println("\nIm Kurs " + course1.name + " von " + teacher1.name() + " sind folgende Teilnehmer: \n" +
                course1.students.toString());
        System.out.println("\nIm Kurs " + course2.name + " von " + teacher2.name() + " sind folgende Teilnehmer: \n" +
                course2.students.toString());
        System.out.println("\nIm Kurs " + course3.name + " von " + teacher3.name() + " sind folgende Teilnehmer: \n" +
                course3.students.toString());


        Course newnamecourse1 = course1.withName("Java for Dummies");
        System.out.println("\nIm Kurs " + course1.name + " von " + teacher1.name() + " sind folgende Teilnehmer: " +
                course1.students.toString());


    }
}