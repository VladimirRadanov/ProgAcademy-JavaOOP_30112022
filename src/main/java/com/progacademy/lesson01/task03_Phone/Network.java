package com.progacademy.lesson01.task03_Phone;

public class Network {
    private String name;
    private Phone[] phones;

    public Network(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone[] getPhones() {
        return phones;
    }

    public void registerPhone(Phone phone) {
        int length;
        if (phones == null) length = 0;
        else length = phones.length;

        Phone[] phonesArray = new Phone[length + 1];

        for (int i = 0; i < length; i++) {
            phonesArray[i] = phones[i];
        }

        phonesArray[length] = phone;
        phones = phonesArray;
    }
}
