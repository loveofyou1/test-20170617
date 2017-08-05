package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class ClientForTestUglyducking {
    public static void main(String[] args) {
        //很久很久以前，这里有一个丑陋的小鸭子
        System.out.println("===很久很久以前，这里有一只丑陋的小鸭子===");
        Swam uglyduck = new UglyDuckling();
        uglyduck.desAppaerance();
        uglyduck.cry();
        uglyduck.fly();

        System.out.println("\n===小鸭子终于发现自己是一只天鹅====");
        uglyduck = new BeautifyAppearance(uglyduck);
        uglyduck = new StrongBehavior(uglyduck);

        uglyduck.desAppaerance();
        uglyduck.cry();
        uglyduck.fly();

    }
}
