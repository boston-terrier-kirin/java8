package com.example;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {
    public static void main(String[] args) {

        // これはできない。
        // Test t = Test::new;

        // デフォルトコンストラクタ
        Supplier<Test> testSupplier = Test::new;
        System.out.println(testSupplier.get());

        // パラメータありのコンストラクタ
        Function<String, Test> testFunction = Test::new;
        var t = testFunction.apply("Hello World");
        t.greet();
    }
}

class Test {
    private String hey;
    // デフォルトのコンストラクタが必要になる。
    public Test() {

    }

    public Test(String hey) {
        this.hey = hey;
    }

    public void greet() {
        System.out.println(this.hey);
    }
}