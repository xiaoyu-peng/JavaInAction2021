package com.xhh.sort;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.util.Arrays;

public class EventTimesOddTimes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3};
        printOddTimesNum1(arr);

        int[] arr2 = {7, 7, 7, 1, 1, 2, 2, 2, 2, 3, 3, 3};
        printOddTimesNum2(arr2);
    }

    /**
     * 数组中只有一项奇数次数字
     * <p>
     * 异或运算，获取奇数项数字
     *
     * @param arr
     */
    public static void printOddTimesNum1(int[] arr) {
        int eor = 0;
        for (int cur : arr) {
            eor ^= cur;
        }
        System.out.println(eor);
    }

    /**
     * 数组中，存在两项不相等的奇数次数字
     *
     * @param arr
     */
    public static void printOddTimesNum2(int[] arr) {

        int eor = 0;
        // eor = a ^ b   eor != 0  eor必然有一个位置上为1
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }

        // eor'
        int onlyOne = 0;
        // 提取出最右边的1
        int rightOne = eor & (~eor + 1);

        for (int cur : arr) {
            if ((cur & rightOne) == 0) {
                onlyOne ^= cur;
            }
        }

        System.out.println(onlyOne + "---" + (eor ^ onlyOne));

    }
}
