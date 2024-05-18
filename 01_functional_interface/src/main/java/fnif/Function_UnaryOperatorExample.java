package fnif;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Function_UnaryOperatorExample {
    /**
     * UnaryOperatorはFunctionを継承していて、引数と戻り値の型が同じ場合に使う。
     */
    public static void main(String[] args) {

        // Functionだと引数＋戻りの両方を定義する必要がある
        Function<String, String> convert_1 = s -> s.toUpperCase();

        // 引数と戻りが同じであれば、UnaryOperatorをつかった方が面倒が減る
        UnaryOperator<String> convert_2 = s -> s.toUpperCase();

        System.out.println(convert_1.apply("test"));
        System.out.println(convert_2.apply("test"));
    }
}
