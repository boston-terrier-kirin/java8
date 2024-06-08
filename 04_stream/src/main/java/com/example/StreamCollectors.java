package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectors {

    public static void main(String[] args) {
        List<String> departmentList = new ArrayList<>();
        departmentList.add("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList.add("Marketing");

        joining(departmentList);
        reducing(departmentList);
        minBy();
    }

    private static void joining(List<String> departmentList) {
        System.out.println("===== Collectors.joining");
        String result = departmentList.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }

    private static void reducing(List<String> departmentList) {
        System.out.println("===== Collectors.reducing");
        String result = departmentList.stream().collect(Collectors.reducing("All Departments: ", (acc, current) -> acc + ", " + current));
        System.out.println(result);
    }

    public static void minBy() {
        System.out.println("===== Collectors.minBy");
        List<Integer> numbers = Arrays.asList(1, 4, 2, 8, 10);
        Integer min = numbers.stream().collect(Collectors.minBy((a, b) -> a - b)).get();
        System.out.println(min);
    }
}
