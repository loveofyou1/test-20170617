package com.sun.test.designModel.decorator;

/**
 * Created by sunleic on 2017/7/19.
 */
public class Source implements Sourceble {
    @Override
    public void method() {
        System.out.println("this is original method!");
    }
}
