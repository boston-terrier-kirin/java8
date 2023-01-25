package fnif;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    /**
     * UnaryOperatorはFunctionを継承していて、引数と戻り値の型が同じ場合に使う。
     */
    public static void main(String[] args) {

        Function<String, String> convert_1 = s -> s.toUpperCase();
        UnaryOperator<String> convert_2 = s -> s.toUpperCase();

        System.out.println(convert_1.apply("test"));
        System.out.println(convert_2.apply("test"));
    }
}
