package com.example;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

    public static List<String> printStudentActivities() {
        // distinctしたいけどSetではなくListを返したい場合、distinctを使う。
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(activities -> activities.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
    }
}
