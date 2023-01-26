package com.example.fn;

@FunctionalInterface
public interface VoidMethodWithNoParams {
    public void printHello();

    public default void hi() {
        System.out.println("Hi");
    }
}
