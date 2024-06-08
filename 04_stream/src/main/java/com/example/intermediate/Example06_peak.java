package com.example.intermediate;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example06_peak {
    public static void main(String[] args) {
        List<Student> students = StudentDataBase
                                    .getAllStudents()
                                    .stream()
                                    .filter(student -> student.getGpa() >= 4)
                                    .peek(student -> System.out.println( "PEEK: " + student))
                                    .collect(Collectors.toList());

        System.out.println(students);
    }
}
