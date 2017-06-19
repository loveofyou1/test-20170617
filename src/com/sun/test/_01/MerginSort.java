package com.sun.test._01;

/**
 * 归并排序
 * 基本排序：归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。
 * 然后再把有序子序列合并为整体有序序列。
 * 时间复杂度：O(nlog2n),稳定
 */
public class MerginSort {
    public MerginSort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private void sort(int[] data, int left, int right) {
        if (left < right) {
            //找出中间索引
            int center = (left + right) / 2;
            //对左边进行递归
            sort(data, left, center);
            //对右边进行递归
            sort(data, center + 1, right);
            //合并
            merge(data, left, center, right);
        }
    }

    private void merge(int[] data, int left, int center, int right) {
        int[] tempArr = new int[data.length];
        int mid = center + 1;
        //third记录中间数组的索引
        int third = left;
        int temp = left;
        while (left <= center && mid <= right) {
            //从两个数组中取出最小的放入中间数组
            if (data[left] <= data[mid]) {
                tempArr[third++] = data[left++];
            } else {
                tempArr[third++] = data[mid++];
            }
        }

        //剩余部分依次放入中间数组
        while (mid <= right) {
            tempArr[third++] = data[mid++];
        }
        while (left <= center) {
            tempArr[third++] = data[left++];
        }

        //将中间数组中的内容复制回原数组
        while (temp <= right) {
            data[temp] = tempArr[temp++];
        }
    }
}
