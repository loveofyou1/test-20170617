package com.sun.test.designModel.templateMethod;

/**
 * 模板方法模式确实非常简单，仅仅使用了Java的继承机制，但它是一个应用非常广泛的
 * 模式。其中，AbstractClass叫做抽象模板，它的方法分为两类：
 * ● 基本方法
 * 基本方法也叫做基本操作，是由子类实现的方法，并且在模板方法被调用。
 * ● 模板方法
 * 可以有一个或几个，一般是一个具体方法，也就是一个框架，实现对基本方法的调度，
 * 完成固定的逻辑。
 * 注意　为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
 * Created by sunleic on 2017/7/25.
 */
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomeThing();

    //基本方法
    protected abstract void doAnyThing();

    //模板方法
    public void templateMethod() {
        /***
         * 调用基本方法，完成相关的逻辑
         */
        doSomeThing();
        doAnyThing();
    }
}
