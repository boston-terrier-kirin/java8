package com.example.termnal;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example03_joining {

    public static void main(String[] args) {
        {
            Stream<Student> studentStream =
                    StudentDataBase.getAllStudents().stream();

            String names = studentStream.map(Student::getName).collect(Collectors.joining(","));
            System.out.println(names);
        }

        {
            Stream<Student> studentStream =
                    StudentDataBase.getAllStudents().stream();

            String names = studentStream.map(Student::getName).collect(Collectors.joining(",", "[", "]"));
            System.out.println(names);
        }
    }
}
