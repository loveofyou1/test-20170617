package com.sun.test._01;

/**
 * 简单选择排序
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 * 然后在剩下的数当中再找最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
 */
public class SelectSort {
    public SelectSort(int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int temp;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[i]) {//注意和冒泡的区别
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }

        }
    }
}
