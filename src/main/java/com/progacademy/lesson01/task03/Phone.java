package com.progacademy.lesson01.task03;

public class Phone {
    private String number;
    private String phoneVendor;
    private String phoneModel;
    private Network network;

    public Phone() {
    }

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoneVendor() {
        return phoneVendor;
    }

    public void setPhoneVendor(String phoneVendor) {
        this.phoneVendor = phoneVendor;
    }

    public String getPhoneModel() {
        return phoneModel;
    }

    public void setPhoneModel(String phoneModel) {
        this.phoneModel = phoneModel;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public void register(Network network) {
        this.network = network;
        network.addNumber(number);
    }

    public String outgoingCall(String number) {
        if (network == null || !network.isNumberRegistered(this.number))
            return "Your phone number: " + this.number + " is not registered";
        else if (network.isNumberRegistered(this.number) && network.isNumberRegistered(number))
            return incomingCall(this.number);
        else if (!network.isNumberRegistered(number))
            return "Number you are calling to: " + number + " is not registered";
        else
            return "Unknown case";
    }

    private String incomingCall(String number) {
        return "Number: " + number + " is calling you";
    }
}
