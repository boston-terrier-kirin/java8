package com.example;

import java.util.function.Function;

public class Example01_Function {

    public static void main(String[] args) {
        // lambdaで書いた場合
        Function<String, String> toUpperCase01 = s -> s.toUpperCase();
        System.out.println(toUpperCase01.apply("abc"));

        // method-referenceで書いた場合
        Function<String, String> toUpperCase02 = String::toUpperCase;
        System.out.println(toUpperCase02.apply("abc"));
    }
}
