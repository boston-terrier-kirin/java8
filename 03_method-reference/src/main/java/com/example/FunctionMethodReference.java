package com.example;

import java.util.function.Function;

public class FunctionMethodReference {

    static Function<String, String> toUpperCaseLambda = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java8"));
    }
}
