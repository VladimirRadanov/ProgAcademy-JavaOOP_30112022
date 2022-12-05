package com.progacademy.lesson02.task01_Animals;

public class Veterinarian {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void treatment(Animal animal) {
        System.out.println("veterinarian: " + name + " is treating " + animal.toString());
    }
}
