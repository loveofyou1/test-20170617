package com.sun.test.designModel.factory;

/**
 * 工厂模式
 */
public class TestFactory {
    public static void main(String args[]) {
        /**
         * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
         */
        SendFactory sendFactory = new SendFactory();
        sendFactory.produce("sms").send();

        /**
         * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
         * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
         */

        Sender sender1 = sendFactory.produceMailSender();
        sender1.send();
        Sender sender2 = sendFactory.prodoceSmsSender();
        sender2.send();

        /**
         * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可
         */
        SendFactory.produceStaticMailSender().send();
        SendFactory.produceStaticSmsSender().send();

        /**
         * 抽象工厂模式（Abstract Factory）
         * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，
         * 有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
         * 缺点是需要的工厂很多时，需要增加很多个类
         */
        Provider provider = new SendMailAbstractFactory();
        provider.produce().send();
        Provider provider1 = new SendSmsAbstractFactory();
        provider1.produce().send();
    }
}
