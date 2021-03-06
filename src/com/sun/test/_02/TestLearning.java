package com.sun.test._02;

import java.io.IOException;

public class TestLearning {
    public static void main(String args[]) throws Exception {
        int i = 5;
        test(i);
        //exceptiontest();
        System.out.println(rightNoSingle(-16) + "," + rightNoSingle(16));
    }

    private static void exceptiontest() throws Exception {
        try {
            throw new Exception("1");
        } catch (IOException e) {
            throw new Exception("2");
        } catch (Exception e) {
            throw new Exception("3");
        } finally {
            throw new Exception("4");
        }
    }

    public static void test(int type) {
        switch (type) {
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            default:
                System.out.println(4);
        }
    }

    /**
     * 右移符号学习
     *
     * @param num
     * @return
     */
    private static int rightNoSingle(int num) {
        if (num == 0) {
            return -1;
        } else if (num < 0) {
            return num >> 1;//带符号位右移
        } else {
            return num >>> 1;//无符号位右移
        }
    }
}
