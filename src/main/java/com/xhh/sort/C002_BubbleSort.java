package com.xhh.sort;

import com.xhh.utils.ArraySwapUtil;

/**
 * 冒泡排序
 */
public class C002_BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 5, 8, 9, 6, 7, 3, 4};
        bubbleSort(arr);
        ArraySwapUtil.printArray(arr);
    }

    public static void bubbleSort(int[] arr) {

        if (null == arr || arr.length < 2) {
            return;
        }
        // 0 ~ N-1
        // 0 ~ N-2
        // 0 ~ N-3
        // 0 ~ e
        for (int e = arr.length - 1; e > 0; e--) {
            //  0 1
            //  1 2
            //  2 3
            //  e-1 e
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    ArraySwapUtil.swapArray(arr, i, i + 1);
                }
            }

        }
    }
}
