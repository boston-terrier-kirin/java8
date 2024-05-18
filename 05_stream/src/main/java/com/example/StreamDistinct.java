package com.example;

import com.example.data.Student;
import com.example.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinct {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Apple", "Grape", "Banana", "Apple");
        fruits.stream().distinct().forEach(System.out::println);
    }
}
