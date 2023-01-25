package com.example;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, String> convert = s -> s.toUpperCase();
        System.out.println("convert: " + convert.apply("test"));

        // andThen
        {
            Function<Integer, Integer> multiply = integer -> integer * 2;
            Function<Integer, Integer> add = integer -> integer + 10;

            Integer result_1 = multiply.andThen(add).apply(5);
            Integer result_2 = multiply.andThen(integer -> integer + 10).apply(5);

            System.out.println("result_1: " + result_1);
            System.out.println("result_2: " + result_2);
        }

        {
            Function<Integer, Integer> multiply = integer -> {
                System.out.println("multiply");
                return integer * 2;
            };
            Function<Integer, Integer> add = integer -> {
                System.out.println("add");
                return integer + 10;
            };

            // add -> multiply の順で呼ばれる。
            multiply.compose(add).apply(10);
        }
    }
}
