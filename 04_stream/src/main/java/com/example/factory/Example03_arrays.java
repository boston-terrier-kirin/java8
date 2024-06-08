package com.example.factory;

import java.util.Arrays;

public class Example03_arrays {

    public static void main(String[] args) {
        String name = "Steph";
        Arrays.stream(name.split("")).forEach(word -> System.out.println(word));
    }
}
