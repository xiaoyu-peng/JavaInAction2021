package com.xhh.thread.chapter07;

import java.util.concurrent.TimeUnit;

public class UncaughtExceptionTest {

    public static void main(String[] args) {

        // 设置回调接口
        Thread.setDefaultUncaughtExceptionHandler((t, e) -> {
            System.out.println(t.getName() + " occur exception!!!");
            e.printStackTrace();
        });

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(1 / 0);
        }).start();
    }
}
