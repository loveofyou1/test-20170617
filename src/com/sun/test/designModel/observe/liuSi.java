package com.sun.test.designModel.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sunleic on 2017/7/25.
 */
public class liuSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("刘斯：韩非子开始活动了，向老板报告----》");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("刘斯开始汇报完毕！");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("刘斯：报告，秦老板！韩非子活动了---》" + reportContext);
    }
}
