package com.sun.test.designModel.proxy;

/**
 * Created by sunleic on 2017/7/19.
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("this is a proxy source class!");
    }
}
