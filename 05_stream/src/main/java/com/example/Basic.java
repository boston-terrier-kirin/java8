package com.example;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {
        // toMap
        {
            var students = StudentDataBase
                            .getAllStudents()
                            .stream()
                            .collect(Collectors.toMap(Student::getName, Student::getActivities));
            System.out.println(students);
            System.out.println("-----");
        }

        // こう書いても同じ
        {
            Function<Student, String> keyMapper = student -> student.getName();
            Function<Student, List<String>> valueMapper = student -> student.getActivities();

            var students = StudentDataBase
                    .getAllStudents()
                    .stream()
                    .collect(Collectors.toMap(keyMapper, valueMapper));
            System.out.println(students);
            System.out.println("-----");
        }

        // こう書いても同じ
        {
            var students = StudentDataBase
                    .getAllStudents()
                    .stream()
                    .collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));
            System.out.println(students);
            System.out.println("-----");
        }

        // filter
        {
            var students = StudentDataBase
                    .getAllStudents()
                    .stream()
                    .filter(student -> student.getGpa() >= 4)
                    .collect(Collectors.toList());
            System.out.println(students);
            System.out.println("-----");
        }
    }
}
