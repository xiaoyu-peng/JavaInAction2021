package com.xhh.thread.chapter07;

import java.util.concurrent.TimeUnit;

public class ThreadHook {

    public static void main(String[] args) {
        // 为应用程序注入钩子线程
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("The hook thread 1 is running.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The hook thread 1 wile exit.");
            }
        });

        // 为应用程序注入钩子线程
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("The hook thread 2 is running.");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("The hook thread 2 wile exit.");
            }
        });

        System.out.println("The program will is stopping.");
    }
}
