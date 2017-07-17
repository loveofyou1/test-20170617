package com.sun.test.designModel.factory;

public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is smsSender");
    }
}
