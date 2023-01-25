package com.example;

import java.util.List;
import java.util.function.Function;

public class LambdaToMethodReference {
    public static void main(String[] args) {
        // Lambdaの場合
        Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();

        // Method Referenceの場合
        Function<String, String> toUpperCase = String::toUpperCase;

        {
            List<String> companyList = List.of("apple", "google", "ms");

            // printがStringを1つ受け取る場合しかコンパイルが通らない。
            companyList.forEach(LambdaToMethodReference::print);
        }
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
