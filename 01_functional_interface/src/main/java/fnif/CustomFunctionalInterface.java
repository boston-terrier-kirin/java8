package fnif;

import java.util.function.Predicate;

interface Evaluate<T> {
    boolean isNegative(T t);
}

public class CustomFunctionalInterface {
    public static void main(String[] args) {

        // Evaluateには1つしかメソッドがないので、ラムダで書ける。
        Evaluate<Integer> test = value -> {
            if (value < 0) {
                return true;
            }
            return false;
        };
        System.out.println(test.isNegative(-1));

        // Predicateでも同じことができる。
        Predicate<Integer> predicate = value -> {
            if (value < 0) {
                return true;
            }
            return false;
        };
        System.out.println(predicate.test(-1));
    }
}
