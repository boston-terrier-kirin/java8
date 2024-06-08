package com.example;

import com.example.data.Student;
import com.example.data.StudentDataBase;

public class Example02_Consumer {

    public static void main(String[] args) {
        // lambdaで書いた場合
        StudentDataBase.getAllStudents().forEach(student -> student.printListOfActivities());

        // method-referenceで書いた場合
        StudentDataBase.getAllStudents().forEach(Student::printListOfActivities);
    }
}
