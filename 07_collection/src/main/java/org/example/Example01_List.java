package org.example;

import java.util.ArrayList;
import java.util.List;

public class Example01_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lucy");
        list.add("Alex");
        list.add("Stephen");

        // Consumer
        list.forEach(name -> System.out.println(name));

        // Predicate
        list.removeIf(name -> name.startsWith("A"));

        System.out.println(list);
    }
}
