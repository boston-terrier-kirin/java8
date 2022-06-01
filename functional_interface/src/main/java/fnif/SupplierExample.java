package fnif;

import java.util.function.Supplier;

/**
 * 引数なし
 * 戻り値あり
 */
public class SupplierExample {
    public static void main(String[] args) {
        {
            System.out.println(getConnectionUrl());
        }

        {
            Supplier<String> getConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";
            System.out.println(getConnectionUrlSupplier.get());
        }
    }

    static String getConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }
}
