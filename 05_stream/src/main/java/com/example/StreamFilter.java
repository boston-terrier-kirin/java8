package com.example;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        departmentList.stream()
                .filter(d -> d.startsWith("S"))
                .map(d -> d.toUpperCase())
                .forEach(System.out::println);
    }
}
