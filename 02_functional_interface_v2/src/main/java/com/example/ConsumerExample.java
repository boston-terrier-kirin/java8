package com.example;

import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> converAndDisplay = s -> {
            System.out.println(s.toUpperCase());
        };

        Consumer<String> appendInput = s -> System.out.println("New Value added: " + s);

        // andThen する意味はあまりない。
        appendInput.andThen(converAndDisplay).accept("yes, we can.");
    }
}
