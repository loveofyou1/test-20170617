package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class UglyDucklingforAdapator extends WhiteSwan implements Duck{
    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void desAppaerance() {
        super.desAppaerance();
    }

    @Override
    public void desBehavior() {
        //丑小鸭不仅会游泳
        System.out.println("会游泳");
        super.fly();

    }
}
