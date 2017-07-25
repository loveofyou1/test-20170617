package com.sun.test.designModel.templateMethod;

/**
 * Created by sunleic on 2017/7/25.
 */
public class HummerTemplate1 extends HummerModel{
    @Override
    void start() {
        System.out.println("模型一启动");
    }

    @Override
    void stop() {
        System.out.println("模型一停止");
    }

    @Override
    void engineBoom() {
        System.out.println("模型一机器轰鸣");
    }

    @Override
    void alarm() {
        System.out.println("模型一鸣笛");
    }
}
