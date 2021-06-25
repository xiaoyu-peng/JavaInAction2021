package com.xhh.thread.chapter03;

import java.util.concurrent.TimeUnit;

public class ThreadIsInterrupted {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.MILLISECONDS.sleep(1);
                    System.out.println("1) thread is interrupted ? " + Thread.currentThread().isInterrupted());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("2) thread is interrupted ? " + Thread.currentThread().isInterrupted());
                }
            }
        });

        thread.setDaemon(true);
        thread.start();

        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("3) Thread is interrupted ? " + thread.isInterrupted());
        thread.interrupt();
        TimeUnit.MILLISECONDS.sleep(2);
        System.out.println("4) Thread is interrupted ? " + thread.isInterrupted());
    }
}
