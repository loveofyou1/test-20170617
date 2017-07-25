package com.sun.test.designModel.observe;

import java.util.Observable;

/**
 * Created by sunleic on 2017/7/25.
 */
public class HanFeiZi extends Observable implements IHanFeiZi {
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃饭了。。。。");
        super.setChanged();
        super.notifyObservers("韩非子吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了。。。。");
        super.setChanged();
        super.notifyObservers("韩非子娱乐");
    }
}
