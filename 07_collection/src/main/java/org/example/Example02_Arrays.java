package org.example;

import java.util.Arrays;
import java.util.List;

public class Example02_Arrays {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(l -> System.out.println(l));

        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 10;
        nums[2] = 20;

        String numChars = Arrays.toString(nums);
        System.out.println(numChars);

        Arrays.stream(nums).forEach(num -> System.out.println(num));
    }
}
