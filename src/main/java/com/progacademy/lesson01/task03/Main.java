package com.progacademy.lesson01.task03;

public class Main {
    public static void main(String[] args) {

        Network network = new Network("My Network");

        Phone phone1 = new Phone("123321");
        Phone phone2 = new Phone("234567");
        Phone phone3 = new Phone("345689");

        phone1.register(network);
        phone2.register(network);

        System.out.println(phone1.outgoingCall(phone2.getNumber()));
        System.out.println(phone1.outgoingCall(phone3.getNumber()));
        System.out.println(phone3.outgoingCall(phone1.getNumber()));

    }
}
