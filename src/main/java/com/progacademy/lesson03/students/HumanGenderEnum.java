package com.progacademy.lesson03.students;

public enum HumanGenderEnum {
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String gender;

    HumanGenderEnum(String gender) {this.gender = gender;}

    @Override
    public String toString() {return gender;}
}
