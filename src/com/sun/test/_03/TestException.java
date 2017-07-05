package com.sun.test._03;

public class TestException {
    public static void main(String args[]) {

        /**try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("e.getMessage():" + e.getMessage());
            System.out.println("e.toString():" + e.toString());
            System.out.println("e.printStackTrace()");
            e.printStackTrace();
        }*/

        /** 测试2*/
        /**try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("e.toString(): " + e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        } finally {
            System.out.println("run finally");
        }*/


        try {
            test();
        } catch (MyException e) {
            System.out.println("Catch My Exception");
            e.printStackTrace();
        }
    }

    public static void test() throws MyException {
        try {
            int i = 10 / 0;
            System.out.println("i=" + i);
        } catch (ArithmeticException e) {
            throw new MyException("This is MyException" + e.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException() {

    }

    public MyException(String msg) {
        super(msg);
    }
}
