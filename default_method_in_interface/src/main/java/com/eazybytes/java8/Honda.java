package com.eazybytes.java8;

public class Honda implements Vehicle {

    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks Applied.");
    }

    /**
     * overrideすれば優先される。
     */
    @Override
    public void autoPilot() {
        System.out.println("HONDA Auto Pilot.");
    }

    /**
     * staticメソッドはoverrideできない。
     */
    // @Override
    public static void sayHello() {
        System.out.println("Hey, This is your favorite honda car.");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.applyBreak();
        honda.autoPilot();

        Honda.sayHello();

        // staticメソッドはクラス名付きで呼び出す。
        Vehicle.sayHello();
    }
}
