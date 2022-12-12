package com.progacademy.lesson03.students;

public class Human {
    private String name;
    private String lastName;
    private HumanGenderEnum gender;

    public Human(String name, String lastName, HumanGenderEnum gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HumanGenderEnum getGender() {
        return gender;
    }

    public void setGender(HumanGenderEnum gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
