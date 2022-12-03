package com.progacademy.lesson02.task01_Animals;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "dog's voice";
    }

    @Override
    public void eat() {
        System.out.println("dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleeping");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "'" + name + '\'' +
                '}';
    }
}
