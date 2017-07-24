package com.sun.test.designModel.flyweight;

import java.util.HashMap;

/**
 * Created by sunleic on 2017/7/24.
 */
public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String entrinsic) {
        //需要返回的对象
        Flyweight flyweight = null;

        //在池中没有该对象
        if (pool.containsKey(entrinsic)) {
            flyweight = pool.get(entrinsic);
        } else {
            //根据外部状态创建享元模式
            flyweight = new ConcreteFlyweight1(entrinsic);
            //放置到池中
            pool.put(entrinsic, flyweight);
        }
        return flyweight;
    }
}
