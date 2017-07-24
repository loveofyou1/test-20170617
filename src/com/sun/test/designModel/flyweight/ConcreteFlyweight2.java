package com.sun.test.designModel.flyweight;

/**
 * Created by sunleic on 2017/7/24.
 */
public class ConcreteFlyweight2 extends Flyweight {
    //接受外部状态
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    //根据外部状态进行逻辑
    @Override
    public void operate() {
        //业务逻辑代码
    }
}
