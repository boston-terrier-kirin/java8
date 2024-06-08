package com.example.factory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example02_iterate {
    public static void main(String[] args) {

        List<Integer> ontToTen =
                Stream.iterate(1, num -> num + 1)
                        .limit(10)
                        .collect(Collectors.toList());

        System.out.println(ontToTen);
    }
}
