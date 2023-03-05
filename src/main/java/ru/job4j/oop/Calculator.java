package ru.job4j.oop;

public class Calculator {

    private static  int x = 5;

    public static int sum(int y) {

        return x + y;
    }

    public int multiply(int a) {
        return a * x;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int d) {
        return sum(d) + minus(d) + multiply(d) + divide(d);
    }

    public static void main(String[] args) {
        int result = sum(10);

        Calculator calculator = new Calculator();
        result = calculator.multiply(10);
        System.out.println("multiply result = " + result);

        result = minus(10);
        System.out.println("minus result = " + result);

        result = calculator.divide(15);
        System.out.println("divide result = " + result);

        result = calculator.sumAllOperation(15);
        System.out.println("sumAllOperation result = " + result);
    }
}
