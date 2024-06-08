package com.example.intermediate;

import java.util.Arrays;
import java.util.List;

public class Example03_distinct {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Grape", "Banana", "Apple");
        fruits.stream().distinct().forEach(System.out::println);
    }
}
