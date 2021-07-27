package com.xhh.sort;

import com.xhh.utils.ArraySwapUtil;

public class C003_InsertionSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 5, 8, 9, 6, 7, 3, 4};
        insertionSort(arr);
    }

    /**
     * TODO 插入排序
     * *
     * * 时间复杂度【最差】：O(n^2)
     * * 空间复杂度: 1
     * * 稳定性： 稳
     */
    public static void insertionSort(int[] arr) {

        // 0 ~ 0 有序的
        // 0 ~ i 想要有序
        for (int i = 1; i < arr.length; i++) {
            // 0 ~ i 做到有序
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                ArraySwapUtil.swapArray(arr, j, j + 1);
            }

            System.out.print("第" + i + "次循环，数组遍历结果为：");
            ArraySwapUtil.printArray(arr);
        }
    }
}
