package com.sun.test.designModel.strategy;

/**
 * Created by sunleic on 2017/7/24.
 */
public class ConcreteStrategy2 implements Strategy{
    @Override
    public void doSomething() {
        System.out.println("策略算法二");
    }
}
