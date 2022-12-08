package com.progacademy.lesson01.task03;

public class Network {
    private String name;
    private String[] numbers;
    private Phone[] phones;

    public Network() {
    }

    public Network(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getNumbers() {
        return numbers;
    }

    public void setNumbers(String[] numbers) {
        this.numbers = numbers;
    }

    public void addNumber(String number) {
        int length;
        if (numbers == null) length = 0;
        else length = numbers.length;

        String[] numbersArray = new String[length + 1];

        for (int i = 0; i < length; i++) {
            numbersArray[i] = numbers[i];
        }

        numbersArray[length] = number;
        numbers = numbersArray;
    }

    public boolean isNumberRegistered(String number) {
        if (numbers != null) {
            for (String s : numbers) {
                if (number.equals(s)) return true;
            }
        }
        return false;
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

    public Phone[] getPhones(){
        return phones;
    }
}
