package com.example;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream().reduce(0, (acc, current) -> acc + current);
        System.out.println(sum);
    }
}
