package com.xhh.sort;


/**
 * 测试 异或运算
 *
 * <p>
 * TODO 【题目一】如何不用额外变量交换两个数
 *
 * 【技巧一】异或运算可以记成：无进位相加！！！
 */
public class C005_TestXOR {

    public static void main(String[] args) {

        int a = 6;
        int b = -999;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("-------------分隔符-------------");


        int[] arr = {3, 1, 100};
        System.out.println("-------------交换前-------------");
        System.out.println(arr[0]);
        System.out.println(arr[2]);

        swap(arr, 0, 2);
        System.out.println("-------------不同内存，交换后-------------");
        System.out.println(arr[0]);
        System.out.println(arr[2]);


        swap(arr, 0, 0);
        System.out.println("-------------统一内存，交换后【出现异常】-------------");
        System.out.println(arr[0]);

    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
