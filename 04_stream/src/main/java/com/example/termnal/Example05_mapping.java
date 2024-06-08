package com.example.termnal;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example05_mapping {

    public static void main(String[] args) {
        Stream<Student> studentStream =
                StudentDataBase.getAllStudents().stream();

        List<String> names = studentStream.collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println(names);
    }
}
