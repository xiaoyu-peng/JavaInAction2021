package com.xhh.sort;

import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import javax.ws.rs.core.StreamingOutput;

/**
 * 【题目二】 一个数组中有一种数出现了奇数次，其他数都出现了偶数次，怎么找到并打印这种数
 *
 * @author PengHui
 */
public class C005_TestXOR_OddTimesNum {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5};
        System.out.println("数组中出现奇数次的数为：" + getOddTimesNum1(arr));


        int[] arr2 = {1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5};
        printOddTimesNum2(arr2);

        System.out.println("=========获取数的二进制中的1的个数：" + getBitCount(3));
    }

    /**
     * 获取一个数，二进制中1的个数
     */
    public static int getBitCount(int N) {
        int count = 0;
        while (0 != N) {
            int rightOne = N & (~N + 1);
            count++;
            //抹去最右边一个1
            N ^= rightOne;
        }

        return count;
    }

    /**
     * arr中，只有一种数出现奇数次
     *
     * @param arr
     * @return
     */
    public static int getOddTimesNum1(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }

    /**
     * arr中，有两种数出现奇数次，两种数且不相等
     *
     * @param arr
     * @return
     */
    public static void printOddTimesNum2(int[] arr) {
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }

        // eor = a ^ b
        // eor !=0
        // eor上必有一个位置为1，通过 n & (~n +1) 找到最右面1
        // 011010000
        // 000010000
        int rightOne = eor & (~eor + 1);
        int onlyOne = 0; //eor`

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & rightOne) != 0) {
                onlyOne ^= arr[i];
            }
        }

        int onlyTwo = onlyOne ^ eor;
        System.out.println(onlyOne + " " + onlyTwo);
    }
}
