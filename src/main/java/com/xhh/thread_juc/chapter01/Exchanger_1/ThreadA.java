package com.xhh.thread_juc.chapter01.Exchanger_1;

import java.io.StringWriter;
import java.util.concurrent.Exchanger;

public class ThreadA extends Thread{

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + exchanger.exchange(" 线程A消息"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
