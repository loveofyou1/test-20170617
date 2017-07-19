package com.sun.test.designModel.adapter;

/**
 * Created by sunleic on 2017/7/19.
 */
public class WrapperTest {
    public static void main(String args[]){
        Sourceable sourceable = new SourceSub1();
        Sourceable sourceable1 = new SourceSub2();

        sourceable.method1();
        sourceable.method2();

        sourceable1.method1();
        sourceable1.method2();
    }
}
