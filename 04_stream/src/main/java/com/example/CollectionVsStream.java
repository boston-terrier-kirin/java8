package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("john");
        names.add("james");

        // The Difference Between Collection.stream().forEach() and Collection.forEach()
        // https://www.baeldung.com/java-collection-stream-foreach#:~:text=Collection.forEach%20%28%29%20uses%20the%20collection%E2%80%99s%20iterator%20%28if%20one,a%20difference%20which%20of%20the%20two%20we%20choose.

        // Streamは1回しかまわせない。
        Stream<String> nameStream = names.stream();
        nameStream.forEach(name-> System.out.println(name));
        System.out.println("-----");

        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        // nameStream.forEach(name-> System.out.println(name));

        // CollectionのforEachは複数回まわせる。
        names.forEach(name-> System.out.println(name));
        System.out.println("-----");
        names.forEach(name-> System.out.println(name));
        System.out.println("-----");

        // streamは順番を保証しないらしい
        List<String> list = Arrays.asList("A", "B", "C", "D");
        list.parallelStream().forEach(System.out::println); // C D A B になったりする
    }
}
