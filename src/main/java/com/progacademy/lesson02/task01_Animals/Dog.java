package com.progacademy.lesson02.task01_Animals;

public class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
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
                "name='" + name + '\'' + ",\t" +
                "ration='" + getRation() + '\'' + ",\t" +
                "color='" + getColor() + '\'' + ",\t" +
                "weight='" + getWeight() + '\'' +
                '}';
    }
}
