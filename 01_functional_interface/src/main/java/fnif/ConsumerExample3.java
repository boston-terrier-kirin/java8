package fnif;

import java.util.List;
import java.util.function.Consumer;

/**
 * 引数あり
 * 戻り値なし
 */
public class ConsumerExample3 {
    public static void main(String[] args) {
        List<String> companyList = List.of("apple", "google", "ms");

        Consumer<String> echo = company -> System.out.println(company);
        Consumer<String> echoUpper = company -> System.out.println(company.toUpperCase());

        companyList.forEach(echo.andThen(echoUpper));
    }
}
