package com.progacademy.lesson02.task01_Animals;

public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    @Override
    public String getVoice() {
        return "cat's voice";
    }

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' + ",\t" +
                "ration='" + getRation() + '\'' + ",\t" +
                "color='" + getColor() + '\'' + ",\t" +
                "weight='" + getWeight() + '\'' +
                '}';
    }
}
