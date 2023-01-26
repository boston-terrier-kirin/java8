package com.example;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> print = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(print);
    }
}
