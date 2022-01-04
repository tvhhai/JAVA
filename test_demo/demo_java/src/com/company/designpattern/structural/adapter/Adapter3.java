package com.company.designpattern.structural.adapter;

public class Adapter3 {
    public static void main(String[] args) {
        PhoneTarget phoneTarget = new PhoneAdapter();
        String input1 = "sdflkqweqweq";
        String input2 = "123";
        String input3 = "01234342342";
        System.out.println(input1 + " is phone number: " + phoneTarget.checkPhoneNumber(input1));
        System.out.println(input2 + " is phone number: " + phoneTarget.checkPhoneNumber(input2));
        System.out.println(input3 + " is phone number: " + phoneTarget.checkPhoneNumber(input3));

    }
}

interface PhoneTarget {
    boolean checkPhoneNumber(String input);
}

class CheckNumberAdaptee {

    public boolean checkNumber(String input) {
        String regex = "[0-9]+";
        return input.matches(regex);
    }
}

 class PhoneAdapter implements PhoneTarget {
    CheckNumberAdaptee checkNumberAdapptee = new CheckNumberAdaptee();
    @Override
    public boolean checkPhoneNumber(String input) {
        if (!checkNumberAdapptee.checkNumber(input)) {
            return false;
        }
        if (input.length() > 11 || input.length() < 10) {
            return false;
        }
        return true;
    }
}