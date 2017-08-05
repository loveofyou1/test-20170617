package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class StrongBehavior extends Decorator{
    public StrongBehavior(Swam swam) {
        super(swam);
    }

    @Override
    public void fly() {
        System.out.println("会飞翔了！");
    }
}
