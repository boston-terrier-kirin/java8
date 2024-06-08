package com.example.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example04_sorted {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Grape Fruit", "Banana", "Apple", "Grape", "Banana", "Apple");
        fruits.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====");

        fruits.stream()
                .distinct()
                .sorted((a, b) -> b.length() - a.length())
                .forEach(System.out::println);


    }
}
