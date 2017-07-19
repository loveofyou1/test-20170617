package com.sun.test.designModel.decorator;

/**
 * Created by sunleic on 2017/7/19.
 */
public class DecoratorTest {
    public static void main(String args[]) {
        Sourceble decorator = new Decorator(new Source());
        decorator.method();
    }
}
