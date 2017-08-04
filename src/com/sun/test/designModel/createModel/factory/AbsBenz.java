package com.sun.test.designModel.createModel.factory;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public abstract class AbsBenz implements ICar {
    public String getBand() {
        return "Benz";
    }

    public abstract String getModel();
}
