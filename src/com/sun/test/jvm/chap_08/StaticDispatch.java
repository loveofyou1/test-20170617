package com.sun.test.jvm.chap_08;

/**
 * Created by sunleic on 2017/7/24.
 */
public class StaticDispatch {
    static abstract class Human {
    }

    static class Man extends Human {
    }

    static class Women extends Human {
    }

    public void sayHello(Human guy) {
        System.out.println("hello,guy!");
    }

    public void sayHello(Man guy) {
        System.out.println("hello,gentleman!");
    }

    public void sayHello(Women guy) {
        System.out.println("hello,lady!");
    }

    public static void main(String args[]) {
        Human man = new Man();
        Human lady = new Women();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(lady);
    }
}
