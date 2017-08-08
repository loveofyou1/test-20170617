package com.sun.test.jvm.chap_10;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试语法糖
 * Created by sunleic on 2017/8/8.
 * Version by ${VERSION}
 */
public class TestSugar {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "您好");
        map.put("how are you", "吃了吗？");
        System.out.println(map.get("hello"));
        System.out.println(map.get("how are you"));
    }
}


