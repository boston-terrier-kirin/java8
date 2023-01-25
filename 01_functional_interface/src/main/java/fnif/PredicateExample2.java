package fnif;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 引数あり
 * 戻り値はboolean
 */
public class PredicateExample2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 23, 33, 11, 8, 6);

        /**
         * filterにはPredicateが使われている。
         */
        {
            Predicate<Integer> filter = (number) -> {
                return number > 10;
            };

            var filtered = numbers.stream().filter(filter);
            System.out.println(filtered.collect(Collectors.toList()));
            System.out.println("-----");
        }

        /**
         * lambdaで引数あり,戻り値booleanを書いても同じ
         */
        {
            var filtered = numbers.stream().filter(number -> number > 10);
            System.out.println(filtered.collect(Collectors.toList()));
            System.out.println("-----");
        }

        /**
         * lambdaで同じコードを繰り返すのが面倒な場合、メソッドリファレンスを使う。
         */
        {
            var filtered = numbers.stream().filter(PredicateExample2::isOver);
            System.out.println(filtered.collect(Collectors.toList()));
            System.out.println("-----");
        }

        /**
         * BiPredicate。
         */
        {
            BiPredicate<Integer, Integer> filter = (number, isOver) -> {
                return number > isOver;
            };

            var filtered = numbers.stream().filter(number -> {
                return filter.test(number, 20);
            });
            System.out.println(filtered.collect(Collectors.toList()));
            System.out.println("-----");
        }
    }

    public static boolean isOver(Integer number) {
        return number > 10;
    }
}
