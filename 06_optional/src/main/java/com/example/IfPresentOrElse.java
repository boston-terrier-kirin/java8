package com.example;

import java.util.Optional;

public class IfPresentOrElse {
    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "Eazy Bytes";

        /**
         * nullになるかもしれない場合、ifPresent / orElseを使う。
         */

        {
            System.out.println("----- ofNullable 値なし");
            Optional<String> nullValue = Optional.ofNullable(str[4]);
            nullValue.ifPresent(s -> System.out.println("ifPresents: " + s));
            System.out.println("orElse: " + nullValue.orElse("DEFAULT"));
        }

        {
            System.out.println("----- ofNullable 値あり");
            Optional<String> nullValue = Optional.ofNullable(str[5]);
            nullValue.ifPresent(s -> System.out.println("ifPresents: " + s));
            System.out.println("orElse: " + nullValue.orElse("DEFAULT"));
        }
    }
}
