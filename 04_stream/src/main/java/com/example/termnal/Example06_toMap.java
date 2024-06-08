package com.example.termnal;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example06_toMap {
    public static void main(String[] args) {
        Stream<Student> studentStream =
                StudentDataBase.getAllStudents().stream();

        Map<String, List<String>> nameActivity =
                studentStream.collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(nameActivity);

        // こう書いても同じ
        {
            Map<String, List<String>> students =
                    StudentDataBase
                        .getAllStudents()
                        .stream()
                        .collect(Collectors.toMap(student -> student.getName(), student -> student.getActivities()));
            System.out.println(students);
        }
    }
}
