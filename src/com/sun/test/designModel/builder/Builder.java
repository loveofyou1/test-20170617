package com.sun.test.designModel.builder;

import com.sun.test.designModel.factory.MailSender;
import com.sun.test.designModel.factory.Sender;
import com.sun.test.designModel.factory.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式：
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。
 * <p>
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
 * 所以与工厂模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
 * Created by sunleic on 2017/7/18.
 */
public class Builder {

    private List<Sender> senderList = new ArrayList<>();

    public void produceMailSender(int count) {

        for (int i = 0; i < count; i++) {
            senderList.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int j = 0; j < count; j++) {
            senderList.add(new SmsSender());
        }
    }

    public List<Sender> getSenderList() {
        return senderList;
    }
}
