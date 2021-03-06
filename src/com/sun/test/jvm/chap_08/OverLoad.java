package com.sun.test.jvm.chap_08;

import java.io.Serializable;

/**
 * Created by sunleic on 2017/7/24.
 */
public class OverLoad {
    public static void sayHello(Object arg){
        System.out.println("hello Object");
    }

    public static void sayHello(int arg){
        System.out.println("hello int");
    }

    public static void sayHello(long arg){
        System.out.println("hello long");
    }

    public static void sayHello(Character arg){
        System.out.println("hello character");
    }

    public static void sayHello(char arg){
        System.out.println("hello char");
    }

    public static void sayHello(Serializable arg){
        System.out.println("hello Serializable");
    }

    public static void main(String[] args){
        sayHello('a');
        sayHello(1);
    }
}
