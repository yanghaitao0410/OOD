package com.yht.codingSecond.myjunit;

public class Calculator {
    private int result = 0;

    public void add(int x) {
        result += x;
    }
    public void substract(int x) {
        result -= x;
    }

    public int getResult() {
        return result;
    }

    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10);
        calculator.substract(5);
        System.out.println(calculator.getResult());
    }

}
