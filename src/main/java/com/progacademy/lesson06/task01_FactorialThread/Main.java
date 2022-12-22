package com.progacademy.lesson06.task01_FactorialThread;

public class Main {
    public static void main(String[] args) {

        int number = 100;
        Factorial[] factorials = new Factorial[number];
        Thread[] threads = new Thread[number];

        for (int i = 0; i < number; i++) {
            factorials[i] = new Factorial(i);
            factorials[i].calculateFactorial();
            threads[i] = new Thread(factorials[i]);
        }

        for (Thread thread : threads) {
            thread.start();
        }

    }
}
