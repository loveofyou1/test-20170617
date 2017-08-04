package com.sun.test.designModel.createModel.factory;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public class BenzFactory implements CarFactory {
    @Override
    public ICar createSuv() {
        return new BenzSuv();
    }

    @Override
    public ICar createVan() {
        return new BenzVan();
    }
}
