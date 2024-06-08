package com.example.termnal;

import java.util.Arrays;
import java.util.List;

public class Example01_count {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Grape", "Banana", "Apple");
        Long count = fruits.stream()
                            .distinct()
                            .count();

        System.out.println(count);
    }
}
