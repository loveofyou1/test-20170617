package com.sun.test.designModel.createModel.builder;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public class Car implements ICar {

    private String engine;
    private String wheel;

    public Car(String engine, String wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    @Override
    public String getWheel() {
        return this.wheel;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    public String toString() {
        return "车的轮子：" + getWheel() + "\n车的发动机：" + getEngine();
    }
}
