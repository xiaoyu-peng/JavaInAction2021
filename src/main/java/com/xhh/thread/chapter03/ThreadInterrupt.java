package com.xhh.thread.chapter03;

import java.util.concurrent.TimeUnit;

public class ThreadInterrupt {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("糟糕，我被打断了！！！");
            }
        });

        thread.start();

        TimeUnit.MILLISECONDS.sleep(2);
        thread.interrupt();

        System.out.println("主线程结束");
    }
}
