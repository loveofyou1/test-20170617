package com.sun.test._01;

import java.util.Iterator;
import java.util.LinkedList;

public class TestSort {
    public static void main(String args[]) {
        int a[] = {
                49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51
        };
        int len = a.length;
        // new InsetSort(a);//直接插入排序
        //new ShellSort(a);//希尔排序
        //new SelectSort(a);//简单选择排序
        //new HeapSort(a);//堆排序：二叉树选择排序
        //new BubbleSort(a);//冒泡排序
        //new QuickSort(a);//快速排序
        // new MerginSort(a);//归并排序
        //new RadixSort(a);
//        for (int i = 0; i < len; i++) {
//            System.out.print(a[i] + ",");
//        }


        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");

        LinkedList list1 = new LinkedList();
        list1.add("c");
        list1.add("d");

        list.addAll(list1);

        Iterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
    }
}
