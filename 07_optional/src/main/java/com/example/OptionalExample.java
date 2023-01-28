package com.example;

import java.util.Locale;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // beforeJava8();

        withJava8();
    }

    public static void beforeJava8() {
        String[] str = new String[10];
        String lowercaseString = str[5].toLowerCase();
        System.out.println(lowercaseString);
    }

    public static void withJava8() {
        String[] str = new String[10];
        str[5] = "Eazy Bytes";

        {
            System.out.println("----- empty");
            Optional<String> empty = Optional.empty();
            System.out.println(empty);
        }

        {
            // str[5] に値が入ることが明確なのであれば、of を使う。
            System.out.println("----- of");
            Optional<String> value = Optional.of(str[5]);
            System.out.println(value.get());
        }

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

        {
            try {
                System.out.println("----- map");
                Optional<String> nonEmptyString = Optional.of("Eazy Bytes");
                Optional<String> emptyString = Optional.empty();
                Optional<String> nullValue = Optional.ofNullable(str[4]);

                System.out.println("nonEmptyString: " + nonEmptyString.map(s -> s.toUpperCase()).get());
                System.out.println("emptyString: " + emptyString.map(s -> s.toUpperCase()).get());
                System.out.println("nullValue: " + nullValue.map(s -> s.toUpperCase()).get());
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        {
            try {
                System.out.println("----- filter");
                Optional<String> nonEmptyString = Optional.of("Eazy Bytes");

                System.out.println("nonEmptyString: " + nonEmptyString.filter(s -> s.equals("EAZY Bytes")).get());
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        {
            try {
                System.out.println("----- ifPresent, isPresent");
                Optional<String> nonEmptyString = Optional.of("Eazy Bytes");

                nonEmptyString.filter(s -> s.equals("Eazy Bytes")).ifPresent(s -> System.out.println("ifPresent-1: " + s));
                nonEmptyString.filter(s -> s.equals("EAZY Bytes")).ifPresent(s -> System.out.println("ifPresent-2: " + s));

                Optional<String> value = nonEmptyString.filter(s -> s.equals("EAZY Bytes"));
                if (value.isPresent()) {
                    System.out.println("isPresent");
                } else {
                    System.out.println("isNotPresent");
                }

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        {
            try {
                System.out.println("----- orElse");
                Optional<String> emptyString = Optional.empty();

                System.out.println(emptyString.orElse("DEFAULT"));

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        {
            try {
                System.out.println("----- orElseGet");
                Optional<String> emptyString = Optional.empty();

                System.out.println(emptyString.orElseGet(() -> "GET DEFAULT VALUE FROM SOMEWHERE"));

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        {
            try {
                System.out.println("----- orElseThrow");
                Optional<String> emptyString = Optional.empty();

                System.out.println(emptyString.orElseThrow(() -> new IllegalStateException("THROW ERROR")));

            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
