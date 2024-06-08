package com.example.intermediate;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example02_flatMap {

    public static void main(String[] args) {
        Stream<Student> studentStream =
                StudentDataBase.getAllStudents().stream();

        Set<String> activitySet =
                studentStream
                        // mapは1対1
                        .map(student -> student.getActivities())
                        // mapは1対N
                        .flatMap(activities -> activities.stream())
                        .collect(Collectors.toSet());

        System.out.println(activitySet);
    }
}
