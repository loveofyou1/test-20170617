package com.sun.test.designModel.templateMethod;

/**
 * Created by sunleic on 2017/7/25.
 */
public class ConcreteClass2 extends AbstractClass{
    @Override
    protected void doSomeThing() {
        System.out.println("doSomething two");
    }

    @Override
    protected void doAnyThing() {
        System.out.println("doAnything two");
    }
}
