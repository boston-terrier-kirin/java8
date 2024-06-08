package com.example.fn;

@FunctionalInterface
public interface StringMethodWithStringParams {
    public String printHello(String name);

    /**
     * defaultはOK
     */
    public default void hi() {
        System.out.println("Hi");
    }

    /**
     * privateメソッドはOK
     */
    private String someHelper() {
        return "help you";
    }

    /**
     * publicはNG。
     * これはコンパイルエラーになる
     */
    // public void test() {
    //   // do something
    // }

    /**
     * staticであれば、publicもOK
     */
    public static String someStaticHelper() {
        return "help you";
    }
}
