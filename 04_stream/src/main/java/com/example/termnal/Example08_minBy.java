package com.example.termnal;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example08_minBy {

    public static void main(String[] args) {
        {
            Stream<Student> studentStream =
                    StudentDataBase.getAllStudents().stream();

            Optional<Student> student =
                    studentStream.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));

            System.out.println(student.get());
        }

        // こう書いても同じ
        {
            Stream<Student> studentStream =
                    StudentDataBase.getAllStudents().stream();

            Optional<Student> student =
                    studentStream.collect(Collectors.minBy((a, b) -> {
                        if (a.getGpa() > b.getGpa()) {
                            return 1;
                        }
                        return -1;
                    }));

            System.out.println(student.get());
        }
    }

}
