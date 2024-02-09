package org.example;

public class Main {

    private static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Результат сложения = " + Calculator.sum(5.975f, -14.2));
        System.out.println("Результат сложения = " + Calculator.sum(0, 8));
        System.out.println("Результат вычитания = " + Calculator.subtract(5.975f, -14.2));
        System.out.println("Результат вычитания = " + Calculator.subtract(0, 8));
        System.out.println("Результат умножения = " + Calculator.multiply(5.975f, -14.2));
        System.out.println("Результат умножения = " + Calculator.multiply(2, 8));
        System.out.println("Результат деления = " + Calculator.divide(7.975f, 2.2));
        System.out.println("Результат деления = " + Calculator.divide(8, 3));
        System.out.println();

        Integer[] mas1 = {1, 0, 8, 12};
        Integer[] mas2 = {1, 0, 8, 15};
        Integer[] mas3 = {1, 0, 8, 12};
        Integer[] mas4 = {1, 0, 8};
        Integer[] mas5 = new Integer[0];
        Integer[] mas6 = new Integer[0];
        String[] mas7 = {"Кот", "Собака", "Рыбка"};
        String[] mas8 = {"Кот", "Собака", "Птичка"};
        String[] mas9 = {"Кот", "Рыбка"};
        String[] mas10 = {"Кот", "Собака", "Рыбка"};
        String[] mas11 = new String[0];
        String[] mas12 = new String[0];
        System.out.println("Результат сравнения числовых массивов = " + compareArrays(mas1, mas2));
        System.out.println("Результат сравнения числовых массивов = " + compareArrays(mas1, mas3));
        System.out.println("Результат сравнения числовых массивов = " + compareArrays(mas1, mas4));
        System.out.println("Результат сравнения числовых массивов = " + compareArrays(mas5, mas6));
        System.out.println();
        System.out.println("Результат сравнения строковых массивов = " + compareArrays(mas7, mas8));
        System.out.println("Результат сравнения строковых массивов = " + compareArrays(mas7, mas9));
        System.out.println("Результат сравнения строковых массивов = " + compareArrays(mas7, mas10));
        System.out.println("Результат сравнения строковых массивов = " + compareArrays(mas11, mas12));

    }


}