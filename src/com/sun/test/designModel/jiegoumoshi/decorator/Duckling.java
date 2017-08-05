package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class Duckling implements Duck {
    @Override
    public void desBehavior() {
        System.out.println("会游泳");
    }

    @Override
    public void cry() {
        System.out.println("叫声是嘎——嘎——嘎");
    }

    @Override
    public void desAppaerance() {
        System.out.println("外形是黄白相间，嘴长");
    }
}
