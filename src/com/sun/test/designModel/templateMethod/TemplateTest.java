package com.sun.test.designModel.templateMethod;

/**
 * Created by sunleic on 2017/7/25.
 */
public class TemplateTest {
    public static void main(String[] args){
        HummerModel hummer1 = new HummerTemplate1();
        HummerModel hummer2 = new HummerTemplate2();
        hummer1.run();
        hummer2.run();
    }
}
