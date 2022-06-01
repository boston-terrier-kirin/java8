package com.eazybytes.java8;

import com.eazybytes.java8.fn.StringMethodWithStringParams;
import com.eazybytes.java8.fn.VoidMethodWithNoParams;

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

        /**
         * パラメータあり
         * 戻り値あり
         */
        StringMethodWithStringParams method3 = name -> "Hi, " + name;
        System.out.println(method3.printHello("ダルビッシュ"));
    }
}
