package com.example.termnal;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example04_counting {

    public static void main(String[] args) {
        Stream<Student> studentStream =
                StudentDataBase.getAllStudents().stream();

        long count = studentStream
                        .filter(student -> student.getGpa() >= 4)
                        .collect(Collectors.counting());

        System.out.println(count);
    }
}
