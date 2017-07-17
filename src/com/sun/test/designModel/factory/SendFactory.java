package com.sun.test.designModel.factory;

public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }


    /**
     * 多个工厂模式修改
     */
    public Sender produceMailSender() {
        return new MailSender();
    }

    public Sender prodoceSmsSender() {
        return new SmsSender();
    }


    /**
     * 静态工厂模式
     */
    public static Sender produceStaticMailSender(){
        return new MailSender();
    }

    public static Sender produceStaticSmsSender(){
        return new SmsSender();
    }
}
