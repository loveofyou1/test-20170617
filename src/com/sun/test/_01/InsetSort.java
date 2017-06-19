package com.sun.test._01;

/**
 * 直接插入排序
 * （1）基本思想：在要排序的一组数中，假设前面(n-1)[n>=2] 个数已经是排
 * 好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
 * 时间复杂度：O(n2)，稳定
 */
public class InsetSort {

    public InsetSort(int[] a) {

        int temp = 0;
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];//将大于temp的值整体后移一位
            }
            a[j + 1] = temp;
        }

        for (int i = 0; i < len; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
