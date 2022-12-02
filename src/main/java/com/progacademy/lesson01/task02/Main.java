package com.progacademy.lesson01.task02;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3, 5.6, 7);
        Triangle triangle2 = new Triangle();

        triangle2.setSide1(4.6);
        triangle2.setSide2(8);
        triangle2.setSide3(12);

        System.out.println(triangle1.area());
        System.out.println(triangle2.area());
    }
}
