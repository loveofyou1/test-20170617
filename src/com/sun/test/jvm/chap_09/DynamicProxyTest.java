package com.sun.test.jvm.chap_09;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sunleic on 2017/7/26.
 */
public class DynamicProxyTest {
    interface IHello {
        void sayHello();
    }

    static class Hello implements IHello {
        @Override
        public void sayHello() {
            System.out.println("hello world");
        }
    }

    static class DynamaicProxy implements InvocationHandler {

        Object originObj;

        Object bind(Object originObj) {
            this.originObj = originObj;
            return Proxy.newProxyInstance(originObj.getClass().getClassLoader(), originObj.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome ");
            return method.invoke(originObj, args);
        }
    }

    public static void main(String[] args) {
        IHello iHello = (IHello) new DynamaicProxy().bind(new Hello());
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        iHello.sayHello();
    }
}
