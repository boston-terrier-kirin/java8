package com.eazybytes.java8;

import com.eazybytes.java8.fn.ArithmeticOperation;

public class AnoymousVsLambda {

    private int sum;

    public static void main(String[] args) {
        AnoymousVsLambda lambda = new AnoymousVsLambda();
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
