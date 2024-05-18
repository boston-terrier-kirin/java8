package fnif;

import java.util.function.BiFunction;

public class Function_BiFunctionExample {
    public static void main(String[] args) {

        /**
         * 普通に書いた場合
         */
        {
            int result = incrementByOneAndMultiply(1,20);
            System.out.println("STEP1: " + result);
        }

        /**
         * BiFunction<T, U, R>で書いた場合
         * 引数2つ、戻り値1つ
         */
        {
            BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFn =
                    (number, numToMultiplyBy) -> (number + 1) * numToMultiplyBy;

            int result = incrementByOneAndMultiplyFn.apply(1, 20);
            System.out.println("STEP2: " + result);
        }

        /**
         * BiFunction<T, U, R>で書いた場合
         * 引数2つ、戻り値1つ
         */
        {
            BiFunction<String, Integer, String> makePlayer =
                    (name, number) -> name + "#" + number;

            String result = makePlayer.apply("Curry", 30);
            System.out.println("STEP3: " + result);
        }
    }
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
