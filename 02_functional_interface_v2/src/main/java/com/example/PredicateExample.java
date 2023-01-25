package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    /**
     * Predicate
     * ・testがfunctional interfaceになっている。
     * ・and/negate/orはdefault
     * ・isEqual/notはstatic
     */
    public static void main(String[] args) {
        Predicate<Integer> isEven = integer -> integer % 2 == 0;
        Predicate<Integer> isGreaterThan50 = integer -> integer > 50;

        System.out.println("isEven: " + isEven.test(2));
        System.out.println("isGreaterThan50: " + isGreaterThan50.test(2));
        System.out.println("isEven.and.isGreaterThan50" + isEven.and(isGreaterThan50).test(62));
        System.out.println("-----");

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect_1 = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
        // integer -> integer % 2 == 0 がPredicateなので、isEvenで置き換えてもOK。
        List<Integer> collect_2 = list.stream().filter(isEven).collect(Collectors.toList());

        System.out.println("collect_1: " + collect_1);
        System.out.println("collect_2: " + collect_2);
    }
}
