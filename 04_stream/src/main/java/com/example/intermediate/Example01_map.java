package com.example.intermediate;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example01_map {

    public static void main(String[] args) {
        Stream<Student> studentStream =
                StudentDataBase.getAllStudents().stream();

        List<String> studentNames =
                studentStream.map(student -> student.getName())
                                .map(name -> name.toUpperCase())
                                .collect(Collectors.toList());

        System.out.println(studentNames);
    }
}
