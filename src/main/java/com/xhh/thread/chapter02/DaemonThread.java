package com.xhh.thread.chapter02;

public class DaemonThread {

    public static void main(String[] args) {

        // 1.主线程开始
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 2.设置守护线程
        thread.setDaemon(true);

        // 3.线程启动
        thread.start();

        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束了");

        // 4.主线程结束
    }

}
