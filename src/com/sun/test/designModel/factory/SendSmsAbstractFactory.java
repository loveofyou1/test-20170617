package com.sun.test.designModel.factory;

public class SendSmsAbstractFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
