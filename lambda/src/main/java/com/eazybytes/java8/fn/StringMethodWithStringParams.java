package com.eazybytes.java8.fn;

@FunctionalInterface
public interface StringMethodWithStringParams {
    public String printHello(String name);

    public default void hi() {
        System.out.println("Hi");
    }
}
