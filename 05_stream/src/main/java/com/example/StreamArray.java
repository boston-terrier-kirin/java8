package com.example;

import java.util.Arrays;

public class StreamArray {

    public static void main(String[] args) {
        String name = "Steph";
        Arrays.stream(name.split("")).forEach(word -> System.out.println(word));
    }
}
