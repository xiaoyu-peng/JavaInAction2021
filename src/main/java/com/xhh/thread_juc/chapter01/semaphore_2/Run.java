package com.xhh.thread_juc.chapter01.semaphore_2;

import java.util.concurrent.TimeUnit;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        RepastService repastService = new RepastService();

        ThreadProducer[] arrayP = new ThreadProducer[60];
        ThreadConsumer[] arrayC = new ThreadConsumer[60];

        for (int i = 0; i < 60; i++) {
            arrayP[i] = new ThreadProducer(repastService);
            arrayC[i] = new ThreadConsumer(repastService);
        }

        TimeUnit.SECONDS.sleep(2);

        for (int i = 0; i < 60; i++) {
            arrayP[i].start();
            arrayC[i].start();
        }

    }
}
