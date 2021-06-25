package com.xhh.sort;

public class C002_BSNearLeft {

    /**
     * 在有序数组中，选择满足 >= value的最左位置
     *
     * @return
     */
    public static int nearestLeftIndex(int[] arr, int value) {
        int L = 0;
        int R = arr.length - 1;
        int index = -1; //记录最左的对号

        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if (arr[mid] >= value) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }

        return index;
    }


    public static int testLeftIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > value) {
                return i;
            }
        }

        return -1;
    }
}
