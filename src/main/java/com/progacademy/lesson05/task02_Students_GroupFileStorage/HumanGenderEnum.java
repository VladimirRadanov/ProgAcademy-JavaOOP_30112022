package com.progacademy.lesson05.task02_Students_GroupFileStorage;

public enum HumanGenderEnum {
    MALE("MALE"),
    FEMALE("FEMALE");

    private final String gender;

    HumanGenderEnum(String gender) {this.gender = gender;}

    @Override
    public String toString() {return gender;}
}
