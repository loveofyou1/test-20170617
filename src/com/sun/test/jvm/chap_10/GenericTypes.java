package com.sun.test.jvm.chap_10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunleic on 2017/8/8.
 * Version by ${VERSION}
 */
public class GenericTypes {
    /**第二个方法添加后不能编译，泛型被擦除，都会变成原生类型List<E>，两个方法是相同的，不是重载*/
//    public static void method(List<String> list) {
//        System.out.println("invoke method(List<String> list)");
//    }

//    public static void method(List<Integer> list) {
//        System.out.println("invoke method(List<Integer> list)");
//    }
    /**另一种实现方式看泛型*/
//    public static String method(List<String> list){
//        System.out.println("invoke method(List<String> list)");
//        return "";
//    }


    public static int method(List<Integer> list){
        System.out.println("invoke method(List<Integer> list)");
        return 1;
    }

    public static void main(String[] args){
        //method(new ArrayList<String>());
        method(new ArrayList<Integer>());
    }
}
