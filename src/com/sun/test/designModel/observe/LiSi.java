package com.sun.test.designModel.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sunleic on 2017/7/25.
 */
public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子的活动，开始向老板回报。。。");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯汇报完毕！");
    }

    private void reportToQinShiHuang(String reportContext) {
        System.out.println("李斯：报告，秦老板！韩非子活动了---》" + reportContext);
    }
}
