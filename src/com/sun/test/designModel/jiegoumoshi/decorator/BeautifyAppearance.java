package com.sun.test.designModel.jiegoumoshi.decorator;

/**
 * Created by sunleic on 2017/8/5.
 * Version by ${VERSION}
 */
public class BeautifyAppearance extends Decorator {
    public BeautifyAppearance(Swam swam) {
        super(swam);
    }

    @Override
    public void desAppaerance() {
        System.out.println("外表是纯白色的，非常惹人喜爱！");
    }
}
