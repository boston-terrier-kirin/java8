package com.example.termnal;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class Example07_toList {

    public static void main(String[] args) {
        List<Student> students =
                StudentDataBase
                    .getAllStudents()
                    .stream()
                    .filter(student -> student.getGpa() >= 4)
                    .collect(Collectors.toList());

        System.out.println(students);
    }
}
