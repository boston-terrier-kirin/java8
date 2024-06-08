package com.example;

import java.util.function.Consumer;

public class EffectivelyFinal {

    private static int value;

    public static void main(String[] args) {
        int i = 0;
        String s = "Hello";

        Consumer<Integer> c1 = (num) -> {
            // ラムダ式で使用される変数は final または実質的に final でなければなりません
            // i ++;

            // class変数の場合はOKっぽい。
            value ++;
        };

        // これはOK。
        Consumer<String> c3 = (hey) -> {
            hey += " World";
            System.out.println(hey);
        };
        c3.accept(s);

        Consumer<Integer> c2 = (num) -> {
            // 変数 'i' はスコープ内ですでに定義されています
            // int i = 0;
        };

    }
}
