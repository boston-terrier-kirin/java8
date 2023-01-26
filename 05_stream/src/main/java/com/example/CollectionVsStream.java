package com.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("john");
        names.add("james");

        // Streamは1回しかまわせない。
        Stream<String> nameStream = names.stream();
        nameStream.forEach(name-> System.out.println(name));
        // nameStream.forEach(name-> System.out.println(name));
        System.out.println("-----");

        // CollectionのforEachは複数回まわせる。
        names.forEach(name-> System.out.println(name));
        System.out.println("-----");
        names.forEach(name-> System.out.println(name));
    }
}
