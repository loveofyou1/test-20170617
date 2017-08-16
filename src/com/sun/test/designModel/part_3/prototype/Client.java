package com.sun.test.designModel.part_3.prototype;

/**
 * Created by sunleic on 2017/8/16.
 * Version by ${VERSION}
 */
public class Client {

    public static void main(String[] args) {
        Thing thing = new Thing();
        Thing cloneThing = thing.clone();
        cloneThing.setProperty("hello");
        System.out.println(cloneThing.toString());
        System.out.println(cloneThing.getProperty());
    }
}
