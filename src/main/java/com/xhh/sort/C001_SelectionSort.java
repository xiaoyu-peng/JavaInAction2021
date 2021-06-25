package com.xhh.sort;

import com.xhh.utils.ArraySwapUtil;

/**
 * 选择排序
 */
public class C001_SelectionSort {

    public static void main(String[] args) {
        int[] arr = {10, 2, 1, 5, 8, 9, 6, 7, 3, 4};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        // i ~ n-1
        for (int i = 0; i < arr.length - 1; i++) {
            // 最小值在哪个位置 i ~ n-1
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                // i ~ n-1 上找最小值的下标
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            ArraySwapUtil.swapArray(arr, i, minIndex);

            System.out.print("第" + i + "次循环，数组遍历结果为：");
            ArraySwapUtil.printArray(arr);
        }
    }

}