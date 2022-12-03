package com.progacademy.lesson02.task01_Animals;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Murchik");
        Dog dog = new Dog("Sharik");

        Veterinarian veterinarian = new Veterinarian("Vasiliy");
        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
    }
}
