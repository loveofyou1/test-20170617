package com.sun.test.designModel.factory;

public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mailSender!");
    }
}
