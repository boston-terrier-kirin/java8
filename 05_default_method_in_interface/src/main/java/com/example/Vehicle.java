package com.example;

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
     * default複数もOK
     */
    public default void turnLeft() {
        System.out.println("Turn Left.");
    }

    /**
     * staticメソッドも使える。
     */
    public static void sayHello() {
        System.out.println("Hey, This is vehicle prototype.");
    }
}
