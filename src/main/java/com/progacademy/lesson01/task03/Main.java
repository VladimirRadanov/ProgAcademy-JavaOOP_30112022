package com.progacademy.lesson01.task03;

public class Main {
    public static void main(String[] args) {

        Network network = new Network("My Network");

        Phone phone1 = new Phone("1111111");
        Phone phone2 = new Phone("2222222");
        Phone phone3 = new Phone("3333333");

        phone1.registerPhone(network);
        phone2.registerPhone(network);

        System.out.println(phone3.outgoingCall(phone1.getNumber()));
        System.out.println(phone3.outgoingCall(phone2.getNumber()));
        System.out.println(phone1.outgoingCall(phone2.getNumber()));
        System.out.println(phone2.outgoingCall(phone1.getNumber()));
        System.out.println(phone1.outgoingCall(phone3.getNumber()));
        System.out.println(phone2.outgoingCall(phone3.getNumber()));

    }
}
