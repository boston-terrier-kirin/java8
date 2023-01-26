package com.example;

import com.example.fn.StringMethodWithStringParams;
import com.example.fn.VoidMethodWithNoParams;

public class LambdaExamples {

    public static void main(String[] args) {

        /**
         * パラメータなし
         * 戻り値なし
         */
        VoidMethodWithNoParams method = () -> System.out.println("Hi");
        method.printHello();

        /**
         * パラメータあり
         * 戻り値あり
         */
        StringMethodWithStringParams method2 = (name) -> {
            return "Yeah, " + name;
        };
        System.out.println(method2.printHello("ダルビッシュ"));
    }
}
