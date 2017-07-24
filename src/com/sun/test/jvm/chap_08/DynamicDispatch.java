package com.sun.test.jvm.chap_08;

/**
 * Created by sunleic on 2017/7/24.
 */
public class DynamicDispatch {
    static abstract class Human {
        protected abstract void sayHello();
    }

    static class Man extends Human {

        @Override
        protected void sayHello() {
            System.out.println("man say hello!");
        }
    }

    static class Women extends Human {
        @Override
        protected void sayHello() {
            System.out.println("women say Hello!");
        }
    }

    public static void main(String[] args) {
        Human man = new Man();
        Human women = new Women();
        man.sayHello();
        women.sayHello();
        man = new Women();
        man.sayHello();
    }
}
