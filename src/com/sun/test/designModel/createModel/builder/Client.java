package com.sun.test.designModel.createModel.builder;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public class Client {
    public static void main(String args[]){
        Director director = new Director();
        ICar benzSuv = director.createBenzSuv();
        System.out.println(benzSuv);
    }
}
