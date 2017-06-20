package com.sun.test._0620;

/**
 * Created by sun on 2017/6/20.
 */
public class Test {
    public static void main(String args[]) {
        // 绑定代理，这种方式会在所有的方法都加上切面方法
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("ProXY Test", "代理"));
        iTalk.talk("业务说明");
    }
}
