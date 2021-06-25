package com.xhh.thread.chapter12;

import com.sun.media.sound.SoftTuning;

import java.util.concurrent.TimeUnit;

public class VolatileFoo {

    // init_value 的最大值
    final static int MAX = 5;

    // init_value 的初始值
    volatile static int init_value = 0;

    public static void main(String[] args) {

        /**
         * 启动一个Reader线程，当发现local_value 和 init_value 不一致时，则输出init_value被修改的信息
         */
        new Thread(() -> {
            int localValue = init_value;
            System.out.println(Thread.currentThread().getName() +" localValue is : "+ localValue);
            while (localValue < MAX) {
                if (init_value != localValue) {
                    System.out.printf("The init_value is updated to [%d]\n", init_value);
                    // 对localValue进行重新赋值
                    localValue = init_value;
                }
            }
        }, "Reader-Thread").start();

        /**
         * 启动Updater线程，用于对init_value的修改，当local_value>=5时，则退出声明周期
         */
        new Thread(() -> {
            int localValue = init_value;
            System.out.println(Thread.currentThread().getName() +" localValue is : "+ localValue);
            while (localValue < MAX) {
                // 修改init_value
                System.out.printf("The init_value will be changed to [%d]\n", ++localValue);
                init_value = localValue;
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Updater-Thread").start();
    }
}
