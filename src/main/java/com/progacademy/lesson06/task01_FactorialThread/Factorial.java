package com.progacademy.lesson06.task01_FactorialThread;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int number;
    private BigInteger factorial;

    public Factorial(int number) {
        this.number = number;
    }

    public void calculateFactorial() {
        factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        calculateFactorial();
        System.out.println(thread.getName() + " " + number + "! = " + factorial);
    }
}
