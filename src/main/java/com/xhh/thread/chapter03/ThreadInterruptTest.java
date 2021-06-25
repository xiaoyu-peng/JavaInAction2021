package com.xhh.thread.chapter03;

import java.util.concurrent.TimeUnit;

public class ThreadInterruptTest {

    public static void main(String[] args) {
        System.out.println("1) main is interrupted ? "+ Thread.interrupted());

        Thread.currentThread().interrupt();

        System.out.println("2) main is interrupted ? "+ Thread.currentThread().isInterrupted());

        try {
            TimeUnit.MINUTES.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("我被中断了");
        }
    }
}
