package com.sun.test.designModel.adapter;

/**
 * Created by sunleic on 2017/7/19.
 */
public class AdapterTest {
    public  static void main(String args[]){
        Targetable targetable = new Adapter();
        targetable.method2();
        targetable.method1();

        Targetable targetable1 = new Wrapper(new Source());
        targetable1.method1();
        targetable1.method2();
    }
}
