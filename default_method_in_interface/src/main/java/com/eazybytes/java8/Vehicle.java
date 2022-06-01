package com.eazybytes.java8;

public interface Vehicle {
    public int getSpeed();

    public void applyBreak();

    /**
     * interfaceにデフォルトメソッドが定義できるようになった。
     */
    public default void autoPilot() {
        System.out.println("Auto Pilot Supported.");
    }

    /**
     * staticメソッドも使える。
     */
    public static void sayHello() {
        System.out.println("Hey, This is vehicle prototype.");
    }
}
