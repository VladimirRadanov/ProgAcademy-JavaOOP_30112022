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

    public void registerPhone(Network network) {
        this.network = network;
        network.registerPhone(this);
    }

    public String outgoingCall(String number) {
        if (network == null)
            return "Your phone number: " + this.number + " is not registered";
        else if (network != null && isPhoneNumberRegistered(number))
            return getPhoneByNumber(number).incomingCall();
        else if (!isPhoneNumberRegistered(number))
            return "Number you are calling to: " + number + " is not registered";
        else
            return "Unknown case";
    }

    public Phone getPhoneByNumber(String number) {
        for (Phone phone : network.getPhones()) {
            if (phone.getNumber().equals(number)) return phone;
        }
        return null;
    }

    public String[] getAllRegisteredNumbers() {
        String[] numbers = new String[network.getPhones().length];
        Phone[] phones = network.getPhones();
        for (int i = 0; i < network.getPhones().length; i++) {
            numbers[i] = phones[i].number;
        }
        return numbers;
    }

    public boolean isPhoneNumberRegistered(String number) {
        for (String num : getAllRegisteredNumbers()) {
            if (num.equals(number)) return true;
        }
        return false;
    }

    private String incomingCall() {
        return "Incoming call to Number: " + number;
    }
}
