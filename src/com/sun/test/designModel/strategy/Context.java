package com.sun.test.designModel.strategy;

/**
 * Created by sunleic on 2017/7/24.
 */
public class Context {
    //抽象策略
    private Strategy strategy = null;

    //构造函数设置具体的策略类
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //获得封装后的策略类
    public void doAnything() {
        this.strategy.doSomething();
    }
}
