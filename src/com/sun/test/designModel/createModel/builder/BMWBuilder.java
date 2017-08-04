package com.sun.test.designModel.createModel.builder;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public class BMWBuilder extends CarBuilder {
    @Override
    protected String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
