package com.example.factory;

import java.util.stream.Stream;

public class Example01_of {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Steph", "Clay", "Draymond ");

        names.forEach(name -> System.out.println(name));
    }
}
