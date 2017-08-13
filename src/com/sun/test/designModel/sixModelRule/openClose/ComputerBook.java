package com.sun.test.designModel.sixModelRule.openClose;

/**
 * Created by sunleic on 2017/8/13.
 * Version by ${VERSION}
 */
public class ComputerBook implements IComputerBook {
    @Override
    public String getName() {
        return "java";
    }

    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getAuthor() {
        return "sun";
    }

    @Override
    public String getScope() {
        return "computer";
    }
}
