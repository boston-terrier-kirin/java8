package fnif;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        /**
         * 普通に書いた場合
         */
        {
            int result = incrementByOne(0);
            System.out.println("STEP1: " + result);
        }

        /**
         * Functionで書いた場合
         * 引数1つ、戻り値1つ
         */
        {
            Function<Integer, Integer> incrementByOneFn = number -> number + 1;
            Function<Integer, Integer> multiplyBy10Fn = number -> number * 10;
            Function<Integer, Integer> incrementThenMultiply = incrementByOneFn.andThen(multiplyBy10Fn);

            int result = incrementThenMultiply.apply(1);
            System.out.println("STEP2: " + result);
        }

        /**
         * 普通に書いた場合
         */
        {
            int result = incrementByOneAndMultiply(1,20);
            System.out.println("STEP3: " + result);
        }

        /**
         * BiFunctionで書いた場合
         * 引数2つ、戻り値1つ
         */
        {
            BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFn =
                    (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;

            int result = incrementByOneAndMultiplyFn.apply(1, 20);
            System.out.println("STEP4: " + result);
        }
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
