package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class Decorator implements Swam {
    private Swam swam;

    public Decorator(Swam swam) {
        this.swam = swam;
    }

    @Override
    public void fly() {
        swam.fly();
    }

    @Override
    public void cry() {
        swam.cry();
    }

    @Override
    public void desAppaerance() {
        swam.desAppaerance();
    }
}
