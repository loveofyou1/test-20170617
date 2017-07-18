package com.sun.test.designModel.builder;

import com.sun.test.designModel.factory.Sender;

import java.util.List;

/**
 * Created by sunleic on 2017/7/18.
 */
public class TestBuilder {
    public static void main(String args[]) {
        Builder builder = new Builder();
        builder.produceMailSender(2);
        builder.produceSmsSender(3);
        List<Sender> list = builder.getSenderList();
        int length = list.size();
        if (list != null && length > 0) {
            for (Sender sender : list) {
                sender.send();
            }
        }
    }
}
