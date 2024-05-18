package com.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        List<Integer> oneToTen = Stream.iterate(1, n -> n + 1)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(oneToTen);
    }
}
