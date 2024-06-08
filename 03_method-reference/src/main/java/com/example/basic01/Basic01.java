package com.example.basic01;

public class Basic01 {
    public static void main(String[] args) {
        // Lambdaで書いた場合
        AddOperation ope1 = (a, b) -> {
            System.out.println("Lambda: " + (a + b));
        };
        ope1.add(100, 200);

        // 毎回同じLambdaを書くのが面倒なので、Methodを参照してしまうのでが、method-ref
        AddOperation ope2 = Basic01::addOperation;
        ope2.add(1000, 2000);

        AddOperation ope3 = Basic01::addOperation;
        ope2.add(1001, 2001);
    }

    public static void addOperation(int a, int b) {
        System.out.println("MethodRef: " + (a + b));
    }
}
