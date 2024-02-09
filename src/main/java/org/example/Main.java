package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат сложения = " + Calculator.sum(5.975f, -14.2));
        System.out.println("Результат сложения = " + Calculator.sum(0, 8));

        System.out.println("Результат вычитания = " + Calculator.subtract(5.975f, -14.2));
        System.out.println("Результат вычитания = " + Calculator.subtract(0, 8));

        System.out.println("Результат умножения = " + Calculator.multiply(5.975f, -14.2));
        System.out.println("Результат умножения = " + Calculator.multiply(2, 8));

        System.out.println("Результат деления = " + Calculator.divide(7.975f, 2.2));
        System.out.println("Результат деления = " + Calculator.divide(8, 3));
    }
}