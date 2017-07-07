package com.sun.test.java8_lamuda;

import java.util.Arrays;

public class LamudaDemo {
    public static void main(String args[]){
        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
    }
}
