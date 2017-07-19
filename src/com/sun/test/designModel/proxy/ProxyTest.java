package com.sun.test.designModel.proxy;

/**
 * Created by sunleic on 2017/7/19.
 */
public class ProxyTest {
    public static void main(String args[]){
        Sourceable proxy = new Proxy();
        proxy.method();
    }
}
