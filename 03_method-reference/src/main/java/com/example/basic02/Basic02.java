package com.example.basic02;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.stream.Stream;

public class Basic02 {
    public static void main(String[] args) {

        Stream<Student> studentStream = StudentDataBase.getAllStudents().stream();

        // このコンテキストはStudentなので、Student::printListOfActivities が可能になる。
        studentStream
                .filter(student -> student.getGpa() >= 4)
                .forEach(Student::printListOfActivities);
    }
}
