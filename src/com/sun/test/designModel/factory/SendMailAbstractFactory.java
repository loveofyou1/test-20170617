package com.sun.test.designModel.factory;

public class SendMailAbstractFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
