package com.sun.test.jvm.chap_10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 自动装箱、拆箱和遍历循环语法糖
 * Created by sunleic on 2017/8/8.
 * Version by ${VERSION}
 */
public class TestPackage {
    public static void main(String[] args) {
        method1_sugar();
        // method2_sugar();
        method3_sugar();
    }

    private static void method1_sugar() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum);
    }
/*
    private static void method2_sugar() {
        long start;
        System.out.println(start = System.currentTimeMillis());
        List list = Arrays.asList(new Integer(1),
                new Integer(2),
                new Integer(3),
                new Integer(4));

        int sum = 0;

        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
            int i = ((Integer) iterator.next()).intValue();
            sum += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - start);
    }*/

    private static void method3_sugar() {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        System.out.println(e == f);
        System.out.println(c == (a + b));
        System.out.println(c.equals(a + b));
        System.out.println(g == (a + b));
        System.out.println(g.equals(a + b));
    }
}
