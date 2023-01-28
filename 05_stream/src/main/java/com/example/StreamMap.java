package com.example;

import com.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    public static List<String> nameList() {
        return StudentDataBase
                    .getAllStudents()
                    .stream()
                    .map(student -> student.getName())
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
