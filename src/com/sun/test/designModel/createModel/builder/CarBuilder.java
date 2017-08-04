package com.sun.test.designModel.createModel.builder;

/**
 * Created by sunleic on 2017/8/4.
 * Version by ${VERSION}
 */
public abstract class CarBuilder {
    //待组装的汽车
    private ICar iCar;
    //设计蓝图
    private Blueprint blueprint;

    public Car buildCar() {
        return new Car(buildEngine(), buildWheel());
    }

    //接收一份设计蓝图
    public void receiveBlueprint(Blueprint _bp) {
        this.blueprint = _bp;
    }

    //查看蓝图，只有真正的建造者才可以查看蓝图
    protected Blueprint getBlueprint() {
        return blueprint;
    }

    //建造车轮
    protected abstract String buildWheel();

    //建造引擎
    protected abstract String buildEngine();
}
