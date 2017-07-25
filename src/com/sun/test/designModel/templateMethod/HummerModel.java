package com.sun.test.designModel.templateMethod;

/**
 * Created by sunleic on 2017/7/25.
 */
public abstract class HummerModel {
    abstract void start();

    abstract void stop();

    abstract void engineBoom();

    abstract void alarm();

    public void run() {
        start();
        stop();
        engineBoom();
        alarm();
    }
}
