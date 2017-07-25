package com.sun.test.designModel.templateMethod;

/**
 * Created by sunleic on 2017/7/25.
 */
public class ConcreteClass1 extends AbstractClass{
    @Override
    protected void doSomeThing() {
        System.out.println("doSomething one");
    }

    @Override
    protected void doAnyThing() {
        System.out.println("doAnything one");
    }
}
