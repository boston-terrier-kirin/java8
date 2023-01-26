package com.example;

import com.example.fn.ArithmeticOperation;

public class AnonymousVsLambda {

    private int sum;

    public static void main(String[] args) {
        AnonymousVsLambda lambda = new AnonymousVsLambda();
        lambda.sum();
    }

    public void sum() {
        int tempSum = 0;

        ArithmeticOperation sumOperation = (a, b) -> {
            int sum = 0;
            sum = a + b;

            // これはOK。
            this.sum = sum + 5;

            // これはコンパイルエラー。
            // tempSum = sum + 10;

            return sum;
        };

        System.out.println(sumOperation.performOperation(5, 10));
        System.out.println(this.sum);
    }
}
