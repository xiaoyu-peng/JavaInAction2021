package com.xhh.sort;

/**
 * 有序数组，验证二分
 */
class C001_BsExist {

    public static boolean exist(int[] sortArr, int num) {
        if (null == sortArr || sortArr.length == 0) {
            return false;
        }

        int L = 0;
        int R = sortArr.length - 1;
        int mid = 0;

        while (L < R) {
            mid = L + (L + R) >> 1;
            if (sortArr[mid] == num) {
                return true;
            } else if (sortArr[mid] < num) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }

        return sortArr[L] == num;
    }
}
