package com.sun.test._0620;

/**
 * Created by sun on 2017/6/20.
 */
public class Test {
    public static void main(String args[]) {
        // �󶨴������ַ�ʽ�������еķ������������淽��
        ITalk iTalk = (ITalk) new DynamicProxy().bind(new PeopleTalk("ProXY Test", "����"));
        iTalk.talk("ҵ��˵��");
    }
}
