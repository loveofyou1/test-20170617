package com.sun.test.designModel.part_3.factoryAndStrategy;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public enum StrategyMan {
    SteadyDeduction("com.sun.test.designModel.part_3.factoryAndStrategy"),
    FreeDeduction("com.sun.test.designModel.part_3.factoryAndStrategy");
    String value = null;

    private StrategyMan(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
