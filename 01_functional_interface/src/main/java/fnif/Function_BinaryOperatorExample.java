package fnif;

import java.util.function.BinaryOperator;

public class Function_BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<String> appendAndCovert = (name, number) -> name + "#" + number;
        System.out.println(appendAndCovert.apply("Curry", "30"));
    }
}
