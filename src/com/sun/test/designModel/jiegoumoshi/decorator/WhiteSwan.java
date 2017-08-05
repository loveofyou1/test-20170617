package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class WhiteSwan implements Swam {
    @Override
    public void fly() {
        System.out.println("能够飞行");
    }

    @Override
    public void cry() {
        System.out.println("叫声是克噜——克噜——克噜");
    }

    @Override
    public void desAppaerance() {
        System.out.println("外形是纯白色，惹人喜爱");
    }
}
