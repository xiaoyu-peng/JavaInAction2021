package com.xhh.thread_juc.chapter01.Exchanger_1;

import java.util.concurrent.Exchanger;

public class ThreadB extends Thread{

    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + exchanger.exchange(" 线程B消息"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
