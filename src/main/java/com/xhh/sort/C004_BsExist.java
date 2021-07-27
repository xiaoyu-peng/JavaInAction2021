package com.xhh.sort;

/**
 * 有序数组，验证二分
 */
class C004_BsExist {

    public static boolean exist(int[] arr, int num) {
        if (null == arr || arr.length == 0) {
            return false;
        }

        int L = 0;
        int R = arr.length - 1;
        int mid = 0;

        while (L < R) {
            mid = L + (L + R) >> 1;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return arr[L] == num;
    }
}
