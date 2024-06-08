package com.example.intermediate;

import java.util.ArrayList;
import java.util.List;

public class Example05_filter {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream()
                .filter(name -> name.startsWith("S"))
                .forEach(name -> System.out.println(name));
    }
}
