package com.sun.test.designModel.part_3.prototype;

/**
 * Created by sunleic on 2017/8/16.
 * Version by ${VERSION}
 */
public class Thing implements Cloneable {

    private String property = null;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * 构造方法不能被clone，复制的是类的属性和方法
     */
    public Thing() {
        System.out.println("构造方法");
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
