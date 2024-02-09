package org.example;

public class Calculator {

    public static <T1 extends Number, T2 extends Number> Number sum(T1 first, T2 second) {
        return first.doubleValue() + second.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> Number subtract(T1 first, T2 second) {
        return first.doubleValue() - second.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> Number multiply(T1 first, T2 second) {
        return first.doubleValue() * second.doubleValue();
    }

    public static <T1 extends Number, T2 extends Number> Number divide(T1 first, T2 second) {
        return first.doubleValue() / second.doubleValue();
    }
}
