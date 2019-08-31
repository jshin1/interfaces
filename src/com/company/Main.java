package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone myPhone;
        myPhone = new DeskPhone(123456);
        myPhone.powerOn();
        myPhone.callPhone(123456);
        myPhone.answer();

        myPhone = new MobilePhone(24567);
        myPhone.powerOn();
        myPhone.callPhone(24567);
        myPhone.answer();

    }
}
