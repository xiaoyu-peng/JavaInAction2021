package com.xhh.utils;

public class ArraySwapUtil {

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("]");
    }

    /**
     * 比较交换
     */
    public static void swapArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
