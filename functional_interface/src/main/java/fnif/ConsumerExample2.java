package fnif;

import java.util.List;
import java.util.function.Consumer;

/**
 * 引数あり
 * 戻り値なし
 */
public class ConsumerExample2 {
    public static void main(String[] args) {
        List<String> companyList = List.of("apple", "google", "ms");

        /**
         * forEachはConsumer(引数あり,戻り値なし)を受け取る。
         */
        {
            Consumer<String> consumer = (s) -> System.out.println(s);
            companyList.forEach(consumer);
            System.out.println("-----");
        }

        /**
         * lambdaで引数あり,戻り値なしを書いても同じ
         */
        {
            companyList.forEach(s -> System.out.println(s));
            System.out.println("-----");
        }

        /**
         * lambdaで同じコードを繰り返すのが面倒な場合、メソッドリファレンスを使う。
         */
        {
            // printがStringを1つ受け取る場合しかコンパイルが通らない。
            companyList.forEach(ConsumerExample2::print);
        }
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
