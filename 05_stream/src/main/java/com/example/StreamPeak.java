package com.example;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamPeak {
    public static void main(String[] args) {
        var students = StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 4)
                .peek(student -> System.out.println( "PEEK: " + student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(students);
        System.out.println("-----");
    }
}
