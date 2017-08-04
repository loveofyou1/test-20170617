package com.sun.test.designModel.createModel.factory;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public abstract class AbsBMW implements ICar {
    public String getBand() {
        return "BMW";
    }

    public abstract String getModel();
}
