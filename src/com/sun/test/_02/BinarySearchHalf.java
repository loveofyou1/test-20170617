package com.sun.test._02;

public class BinarySearchHalf {
    public static void main(String args[]) {
        int[] searchArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(searchArr, 9));
        System.out.println(binarySearchDi(searchArr, 0, 8, 8));
        System.out.println(lineSearch(searchArr, 7));
    }

    /**
     * 二分查找
     * @param a
     * @param t
     * @return
     */
    private static int binarySearch(int[] a, int t) {
        int low, mid, high;
        low = 0;
        high = a.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] < t) {
                low = mid + 1;
            } else if (a[mid] > t) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 二分查找递归算法
     * @param a
     * @param start
     * @param end
     * @param s
     * @return
     */
    private static int binarySearchDi(int[] a, int start, int end, int s) {
        if (a == null)
            return -1;
        if (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] < s) {
                return binarySearchDi(a, mid + 1, end, s);
            } else if (a[mid] > s) {
                return binarySearchDi(a, start, mid - 1, s);
            } else {
                return mid;
            }
        } else
            return -1;

    }

    /**
     * 线性查找
     * @param array
     * @param search
     * @return
     */
    private static int lineSearch(int[] array, int search) {
        if (array == null) {
            return -1;
        }
        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
