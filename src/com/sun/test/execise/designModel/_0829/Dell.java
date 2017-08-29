package com.sun.test.execise.designModel._0829;

/**
 * Created by sunleic on 2017/8/29.
 * Version by ${VERSION}
 */
public class Dell implements IComputer{
    @Override
    public String getCpu() {
        return "intel-i7";
    }

    @Override
    public String getSystem() {
        return "windows10";
    }
}
