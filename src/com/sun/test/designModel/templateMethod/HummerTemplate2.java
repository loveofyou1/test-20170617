package com.sun.test.designModel.templateMethod;

/**
 * Created by sunleic on 2017/7/25.
 */
public class HummerTemplate2 extends HummerModel{
    @Override
    void start() {
        System.out.println("模型二启动1");
    }

    @Override
    void stop() {
        System.out.println("模型二停止");
    }

    @Override
    void engineBoom() {
        System.out.println("模型二机器轰鸣");
    }

    @Override
    void alarm() {
        System.out.println("模型二鸣笛");
    }
}
