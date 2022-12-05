package com.progacademy.lesson02.task01_Animals;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("cat's ration", "white",3,"Murchik");
        Dog dog = new Dog("dog's ration", "brown", 5,"Sharik");

        Veterinarian veterinarian = new Veterinarian("Vasiliy");
        veterinarian.treatment(cat);
        veterinarian.treatment(dog);
    }
}
