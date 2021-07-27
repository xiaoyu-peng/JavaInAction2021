package com.xhh.sort;

/**
 * 无序数据，获取局部最小的值
 *
 * @author PengHui
 */
public class C006_GetLocalMin {

    public static void main(String[] args) {

    }


    public static int getLessIndex(int[] arr) {
        if (null == arr || arr.length == 0) {
            // 不存在
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }

        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while (left < right) {
            mid = left + ((right - left) >> 1);

            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
